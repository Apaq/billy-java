package com.previsto.billy.repository;

import com.previsto.billy.mapping.PersistBankPaymentMapping;
import com.previsto.billy.mapping.PluralBankPaymentMapping;
import com.previsto.billy.mapping.SingularBankPaymentMapping;
import com.previsto.billy.model.BankPayment;
import com.previsto.billy.model.BankPayment;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class BankPaymentResource extends Resource<BankPayment>{

    private static final Map<String, String> SIDELOAD_PARAMS = new HashMap<>();


    public BankPaymentResource(RestTemplate restTemplate, String serviceUrl) {
        super(SingularBankPaymentMapping.class, PluralBankPaymentMapping.class, PersistBankPaymentMapping.class, "bankPayments", restTemplate, serviceUrl, SIDELOAD_PARAMS);
    }
    
}