package dk.apaq.billy;

import com.fasterxml.jackson.databind.ObjectMapper;
import dk.apaq.billy.exception.ApiException;
import dk.apaq.billy.exception.AuthenticationException;
import dk.apaq.billy.exception.RequestException;
import dk.apaq.billy.exception.UnknownException;
import dk.apaq.billy.exception.BillyException;
import dk.apaq.billy.exception.ResourceNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public class ErrorHandler implements ResponseErrorHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getRawStatusCode() >= 300;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        Class<? extends BillyException> clazz;

        if (response.getRawStatusCode() >= 500) {
            clazz = ApiException.class;
        } else if (response.getRawStatusCode() == 401 || response.getRawStatusCode() == 403) {
            clazz = AuthenticationException.class;
        } else if (response.getRawStatusCode() == 404) {
            clazz = ResourceNotFoundException.class;
        } else {
            clazz = RequestException.class;
        }

        String content = IOUtils.toString(response.getBody());
        BillyException ex;
        try {
            ex = objectMapper.readValue(content, clazz);
        }
        catch (Throwable t) {
            ex = objectMapper.readValue(content, UnknownException.class);
        }
        throw ex;
    }

}
