package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistInvoiceMapping;
import dk.apaq.billy.mapping.PluralInvoiceMapping;
import dk.apaq.billy.mapping.SingularInvoiceMapping;
import dk.apaq.billy.model.Email;
import dk.apaq.billy.model.Invoice;
import dk.apaq.billy.model.enums.InvoiceState;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

public class InvoiceResource extends Resource<Invoice>{
    
    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();
    
    static {
        SIDELOAD_PARAMS.put("include", "invoice.lines:embed");
    }
    
    public InvoiceResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularInvoiceMapping.class, PluralInvoiceMapping.class, PersistInvoiceMapping.class, "invoices", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
    public void approve(String id) {
        URI url = buildUri(id);
        
        Map<String, Map> body = new HashMap<>();
        Map<String, InvoiceState> data = new HashMap<>();
        
        body.put("invoice", data);
        data.put("state", InvoiceState.Approved);
        
        
        restTemplate.put(url, body);
    }
    
    public void send(String id, Email email) {
        URI url = buildUri(id, "/emails");
        
        Map<String, Email> body = new HashMap<>();
        body.put("email", email);
        restTemplate.postForEntity(url, body, Map.class);
    }
    
}