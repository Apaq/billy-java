package com.previsto.billy.repository;

import com.previsto.billy.mapping.PersistInvoiceMapping;
import com.previsto.billy.mapping.PluralInvoiceMapping;
import com.previsto.billy.mapping.SingularInvoiceMapping;
import com.previsto.billy.model.Invoice;
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
    
}