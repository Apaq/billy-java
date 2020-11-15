package dk.apaq.billy;

public class BillyClientFactory {

    private final String serviceUrl;

    public BillyClientFactory(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }
    
    public BillyClient create(String apiKey) {
        return new BillyClient(apiKey, serviceUrl);
    }
    public BillyClient create(String organizationId, String apiKey) {
        return new BillyClient(organizationId, apiKey, serviceUrl);
    }
}
