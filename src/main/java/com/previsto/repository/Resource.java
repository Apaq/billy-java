package com.previsto.repository;

import com.previsto.exception.RequestException;
import com.previsto.model.Entity;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Persistable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class Resource<T extends Persistable<String>> {

    private static final Logger LOG = LoggerFactory.getLogger(Resource.class);
    protected final RestTemplate restTemplate;
    protected final String fiscalUrl;
    protected final String servicePath;
    protected Class<T> clazz;
    protected String resourceName;

    public Resource(Class<T> clazz, String resourceName, RestTemplate restTemplate, String fiscalUrl) {
        this(clazz, resourceName, restTemplate, fiscalUrl, null);
    }

    public Resource(Class<T> clazz, String resourceName, RestTemplate restTemplate, String fiscalUrl, String servicePath) {
        this.clazz = clazz;
        this.resourceName = resourceName;
        this.restTemplate = restTemplate;
        this.fiscalUrl = fiscalUrl;
        this.servicePath = servicePath == null ? "" : servicePath;
    }

    public List<T> findAll() {
        return findAll(null).getContent();
    }

    public List<T> findAll(boolean includeRelations) {
        return findAll(null, false, includeRelations).getContent();
    }

    public Page<T> findAll(PageRequest pageRequest) {
        return findAll(pageRequest, false, false);
    }

    public Page<T> findAll(PageRequest pageRequest, boolean includeDeactived, boolean includeRelations) {
        URI url = buildUri();
        ParameterizedTypeReference<List<T>> responseType = new ParameterizedTypeReference<List<T>>() {
            @Override
            public Type getType() {
                return Array.newInstance(clazz, 0).getClass();
            }
        };

        UriComponentsBuilder builder = UriComponentsBuilder.fromUri(url);
        if (pageRequest != null) {
            builder.queryParam("Page", pageRequest.getPageNumber());
            builder.queryParam("PageSize", pageRequest.getPageSize());
        } else {
            builder.queryParam("ForceNoPaging", true);
        }

        if (includeDeactived) {
            builder.queryParam("ShowDeactivated", true);
        }

        url = builder.build().encode().toUri();
        ResponseEntity resp = restTemplate.exchange(url, HttpMethod.GET, null, responseType);
        T[] result = (T[]) resp.getBody();
        int count = -1;

        if (resp.getHeaders().getFirst("Count") != null) {
            try {
                count = Integer.parseInt(resp.getHeaders().getFirst("Count"));
            } catch (NumberFormatException ex) {
                LOG.info("Unable to parse count.", ex);
            }
        }

        if (includeRelations) {
            for (T entity : result) {
                loadRelations(entity);
            }
        }

        return new PageImpl<>(Arrays.asList(result), pageRequest, count);
    }

    protected void loadRelations(T entity) {
    }

    protected boolean saveRelations(T entity, T orgEntity) {
        return false;
    }

    public T get(String id) {
        URI uri = buildUri(id);
        T entity = (T) restTemplate.getForObject(uri, clazz);
        if(entity != null) {
            loadRelations(entity);
        }
        return entity;
    }

    public void delete(T entity) {
        Entity e = null;
        if(entity instanceof Entity) {
            e = (Entity) entity;
        }
        if (e == null || e.getId() == null) {
            throw new RequestException("Entity cannot be deleted, because it has no id.");
        }
        delete(e.getId());
    }

    public void delete(String id) {
        restTemplate.delete(buildUri(id));
    }

    public T save(T entity) {
        if(!(entity instanceof Entity)) {
            throw new RequestException("Entity cannot be persisted.");
        }
            
        Entity e = (Entity) entity;
        URI uri = buildUri(e.getId());
        T persistedEntity;
        
        if(e.getId() == null) {
            ResponseEntity<T> response = restTemplate.postForEntity(uri, entity, clazz);
            persistedEntity = response.getBody();
        } else {
            restTemplate.put(uri, entity);
            persistedEntity = entity;
        }
        
        saveRelations(persistedEntity, entity);
        return persistedEntity;
    }

    protected URI buildUri() {
        return this.buildUri(null);
    }

    protected URI buildUri(String id) {
        try {
            String url = fiscalUrl + resolveServicePath(id);
            return new URI(url);
        } catch (URISyntaxException ex) {
            LOG.error("URI invalid.", ex);
            throw new IllegalArgumentException("Url is not valid.", ex);
        }
    }

    protected String resolveServicePath(String id) {
        return resolveServicePath(id, false);
    }
    
    protected String resolveServicePath(String id, boolean ignoreParentPath) {
        String path = ignoreParentPath ? "" : servicePath;
        if (id == null) {
            path += "/" + resourceName;
        } else {
            path += "/" + resourceName + "/" + id;
        }
        return path;
    }

}
