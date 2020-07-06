package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistContactMapping;
import dk.apaq.billy.mapping.PluralContactMapping;
import dk.apaq.billy.mapping.SingularContactMapping;
import dk.apaq.billy.model.Contact;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class ContactResource extends Resource<Contact>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
        SIDELOAD_PARAMS.put("include", "contact.city,contact.zipcode,contact.contactPersons:embed");
    }
    
    public ContactResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularContactMapping.class, PluralContactMapping.class, PersistContactMapping.class, "contacts", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}
