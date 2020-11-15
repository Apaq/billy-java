package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistAccountMapping;
import dk.apaq.billy.mapping.PluralAccountMapping;
import dk.apaq.billy.mapping.SingularAccountMapping;
import dk.apaq.billy.model.Account;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class AccountResource extends Resource<Account>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
        SIDELOAD_PARAMS.put("include", "account.group");
    }

    public AccountResource(RestTemplate restTemplate, String serviceUrl, String organizationId) {
        super(SingularAccountMapping.class, PluralAccountMapping.class, PersistAccountMapping.class,
                "accounts", restTemplate, serviceUrl, SIDELOAD_PARAMS, organizationId);
    }
    
}