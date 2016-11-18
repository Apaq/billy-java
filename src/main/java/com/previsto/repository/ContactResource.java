package com.previsto.repository;

import com.previsto.mapping.PersistContactMapping;
import com.previsto.mapping.PluralContactMapping;
import com.previsto.mapping.SingularContactMapping;
import com.previsto.model.Contact;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class ContactResource extends Resource<Contact>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
        SIDELOAD_PARAMS.put("include", "contact.city,contact.zipcode");
    }
    
    public ContactResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularContactMapping.class, PluralContactMapping.class, PersistContactMapping.class, "contacts", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}
