package com.previsto;

public class BillyClientFactory {

    private final String serviceUrl;

    public BillyClientFactory(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }
    
    public BillyClient create(String apiKey, long fiscalId) {
        return new BillyClient(fiscalId, apiKey, serviceUrl);
    }
}
