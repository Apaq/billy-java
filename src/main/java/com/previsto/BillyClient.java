package com.previsto;

import com.previsto.net.RestTemplateHelper;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class BillyClient {

    private static final Logger LOG = LoggerFactory.getLogger(BillyClient.class);
    public static final LocalDate EPOCH = LocalDate.of(1970, Month.JANUARY, 1);
    private static final String XENA_API_KEY_HEADER = "X-Access-Token";

    private final RestTemplate restTemplate;
    private final String serviceUrl;
    private final String apiKey;
    private final HttpComponentsClientHttpRequestFactory requestFactory;

    public BillyClient(String apiKey, String serviceUrl) {
        this.requestFactory = new HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        this.restTemplate = new RestTemplate(this.requestFactory);
        this.restTemplate.setErrorHandler(new ErrorHandler());
        this.serviceUrl = serviceUrl;
        this.apiKey = apiKey;

        RestTemplateHelper.configureForXenaJargon(restTemplate);

        
        //Apply default timeouts
        this.requestFactory.setConnectTimeout(10000);
        this.requestFactory.setReadTimeout(10000);
        
        // Apply security
        Header tokenHeader = new BasicHeader(XENA_API_KEY_HEADER, apiKey);
        HttpClient httpClient = HttpClients.custom().setDefaultHeaders(Collections.singleton(tokenHeader)).build();
        this.requestFactory.setHttpClient(httpClient);
    }
    
    public void setConnectTimeout(int millis) {
        this.requestFactory.setConnectTimeout(millis);
    }
    
    public void setReadTimeout(int millis) {
        this.requestFactory.setReadTimeout(millis);
    }
    
    private String appendFiscalPath(String url) {
        if(!url.endsWith("/")) {
            url = url + "/";
        }
        return url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    /*public Resource<Article> getArticleResource() {
        return new Resource<>(Article.class, "Article", restTemplate, appendFiscalPath(serviceUrl));
    }
    
    */
}
