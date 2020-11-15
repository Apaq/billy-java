package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistContactPersonMapping;
import dk.apaq.billy.mapping.PluralContactPersonMapping;
import dk.apaq.billy.mapping.SingularContactPersonMapping;
import dk.apaq.billy.model.ContactPerson;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ContactPersonResource extends Resource<ContactPerson>{

    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();

    public ContactPersonResource(RestTemplate restTemplate, String serviceUrl, String organizationId) {
        super(SingularContactPersonMapping.class, PluralContactPersonMapping.class, PersistContactPersonMapping.class,
                "contactPersons", restTemplate, serviceUrl, SIDELOAD_PARAMS, organizationId);
    }

    public Page<ContactPerson> findAllByContactId(String contactId, PageRequest pageRequest) {
        return findAll(pageRequest, Collections.singletonMap("contactId", contactId));
    }
}
