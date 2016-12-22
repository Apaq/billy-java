package com.previsto.billy.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;



public class ApiException extends BillyException {

    @JsonCreator
    public ApiException(@JsonProperty("errorMessage") String errorMessage, @JsonProperty("errorCode") String errorCode) {
        super(errorMessage);
    }

    
    private static final long serialVersionUID = 1L;

}
