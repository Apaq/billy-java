package com.previsto.net;

import java.io.IOException;
import java.net.URI;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

public class ResultInterceptor implements ClientHttpRequestInterceptor {

    private static final String[] PAGED_RESULT_PATH_ENDINGS = {
        "/contacts"
    };

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        ClientHttpResponse response = execution.execute(request, body);
        
        if(response.getStatusCode() == HttpStatus.OK) {
            response = new ResultAdapterResponse(response);
        }
        
        return response;
    }
    
    
}
