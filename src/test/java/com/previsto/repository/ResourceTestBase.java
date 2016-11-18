package com.previsto.repository;

import com.previsto.repository.Resource;
import com.previsto.ErrorHandler;
import com.previsto.model.Entity;
import com.previsto.net.RestTemplateHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.client.RequestMatcher;
import org.springframework.web.client.RestTemplate;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import org.springframework.test.web.client.response.DefaultResponseCreator;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withStatus;

public abstract class ResourceTestBase<T extends Entity> {

    private MockRestServiceServer mockServer;
    private final Resource<T> resource;
    private final RestTemplate restTemplate;
    private final String resourceName;

    public ResourceTestBase(Resource<T> resource) {
        this.resource = resource;
        this.resource.restTemplate.setErrorHandler(new ErrorHandler());
        this.restTemplate = resource.restTemplate;
        this.resourceName = resource.resourceName;
    }

    @Before
    public void setUp() {
        mockServer = MockRestServiceServer.createServer(restTemplate);
    }
    
    protected String readResourceFromFile(String name) {
        InputStream is = getClass().getResourceAsStream(name);
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(is))) {
            return buffer.lines().collect(Collectors.joining("\n"));
        }
        catch (IOException ex) {
            Logger.getLogger(ResourceTestBase.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    protected abstract DefaultResponseCreator generateExpectedGetResponse();
    protected abstract DefaultResponseCreator generateExpectedFindAllResponse();
    
    protected abstract RequestMatcher generateExpectedSaveRequest();
    
    protected abstract void doCheckEntity(T entity);

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        mockServer.expect(requestTo(resource.serviceUrl + "/" + resourceName + "?ForceNoPaging=true")).andExpect(method(HttpMethod.GET))
                .andRespond(generateExpectedFindAllResponse());
        List<T> entities = resource.findAll();
        for(T entity : entities) {
            doCheckEntity(entity);
        }
        
        mockServer.verify();
    }

    @Test
    public void testGet() {
        System.out.println("get");
        String id = "42L";
        
        mockServer.expect(requestTo(resource.serviceUrl + "/" + resourceName + "/" + id)).andExpect(method(HttpMethod.GET))
                .andRespond(generateExpectedGetResponse());
        T entity = resource.get(id);
        doCheckEntity(entity);
        
        mockServer.verify();
    }
    
    @Test
    public void testGetNotFound() {
        System.out.println("get");
        String id = null;
        
        mockServer.expect(requestTo(resource.serviceUrl + "/" + resourceName + "/" + id)).andExpect(method(HttpMethod.GET))
                .andRespond(withStatus(HttpStatus.NOT_FOUND));
        T entity = resource.get(id);
        assertNull(entity);
        mockServer.verify();
    }

    @Test
    public void testSave() {
        System.out.println("save");
        String id = "42L";
        
        mockServer.expect(requestTo(resource.serviceUrl + "/" + resourceName + "/" + id)).andExpect(method(HttpMethod.GET))
                .andRespond(generateExpectedGetResponse());
        mockServer.expect(requestTo(resource.serviceUrl + "/" + resourceName + "/" + id)).andExpect(method(HttpMethod.PUT)).andExpect(generateExpectedSaveRequest())
                .andRespond(generateExpectedGetResponse());
        T entity = resource.get(id);
        resource.save(entity);
        mockServer.verify();
        
    }

    
    public static RestTemplate buildRestTemplate() {
        RestTemplate rt = new RestTemplate();
        RestTemplateHelper.configureForBillyJargon(rt);
        return rt;
    }
}
