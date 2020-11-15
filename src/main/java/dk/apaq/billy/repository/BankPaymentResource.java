package dk.apaq.billy.repository;

import dk.apaq.billy.mapping.PersistBankPaymentMapping;
import dk.apaq.billy.mapping.PluralBankPaymentMapping;
import dk.apaq.billy.mapping.SingularBankPaymentMapping;
import dk.apaq.billy.model.BankPayment;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class BankPaymentResource extends Resource<BankPayment>{

    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();


    public BankPaymentResource(RestTemplate restTemplate, String serviceUrl, String organizationId) {
        super(SingularBankPaymentMapping.class, PluralBankPaymentMapping.class, PersistBankPaymentMapping.class,
                "bankPayments", restTemplate, serviceUrl, SIDELOAD_PARAMS, organizationId);
    }
    
}