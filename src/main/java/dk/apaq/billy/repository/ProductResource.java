package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistProductMapping;
import dk.apaq.billy.mapping.PluralProductMapping;
import dk.apaq.billy.mapping.SingularProductMapping;
import dk.apaq.billy.model.Product;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class ProductResource extends Resource<Product>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
    }
    
    public ProductResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularProductMapping.class, PluralProductMapping.class, PersistProductMapping.class, "products", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}