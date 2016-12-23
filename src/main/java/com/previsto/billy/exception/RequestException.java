package com.previsto.billy.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestException extends BillyException {

    @JsonCreator
    public RequestException(@JsonProperty(value = "errorCode") String errorCode, @JsonProperty(value = "errorMessage") String errorMessage, @JsonProperty("helpUrl") String helpUrl, @JsonProperty("meta") ExceptionMeta meta) {
        super(errorMessage, errorCode, meta);
    }

    public RequestException(String message) {
        super(message);
    }
    
    

    
    private static final long serialVersionUID = 1L;

    
}
