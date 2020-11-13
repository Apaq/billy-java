package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistContactPersonMapping;
import dk.apaq.billy.mapping.PluralContactPersonMapping;
import dk.apaq.billy.mapping.SingularContactPersonMapping;
import dk.apaq.billy.model.ContactPerson;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class ContactPersonResource extends Resource<ContactPerson>{

    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();

    public ContactPersonResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularContactPersonMapping.class, PluralContactPersonMapping.class, PersistContactPersonMapping.class, "contactPersons", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}
