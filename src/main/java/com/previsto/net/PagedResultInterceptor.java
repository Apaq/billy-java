package com.previsto.net;

import java.io.IOException;
import java.net.URI;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class PagedResultInterceptor implements ClientHttpRequestInterceptor {

    private static final String[] PAGED_RESULT_PATH_ENDINGS = {
        "/Article",
        "/ArticleGroup",
        "/Context",
        "/Invoice",
        "/Order",
        "/OrderLine",
        "/Journal",
        "/OrderTask",
        "/Partner",
        "/PartnerContext",
        "/PartnerLocation",
        "/PartnerTelephoneNumber",
        "/Subscription",
        "/SubscriptionLine",
        "/TelephoneNumber",
        "/WebHook"
    };

    private boolean isPathForPagedResult(URI uri) {
        for (String ending : PAGED_RESULT_PATH_ENDINGS) {
            if (uri.getPath().endsWith(ending)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        ClientHttpResponse response = execution.execute(request, body);
        
        if(request.getMethod() == HttpMethod.GET && isPathForPagedResult(request.getURI()) && response.getStatusCode() == HttpStatus.OK) {
            response = new PagedResultAdapterResponse(response);
        }
        
        return response;
    }
    
    
}
