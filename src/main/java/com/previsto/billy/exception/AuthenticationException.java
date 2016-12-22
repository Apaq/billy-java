package com.previsto.billy.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;


public class AuthenticationException extends BillyException {

    @JsonCreator
    public AuthenticationException(@JsonProperty(value = "AssignedId") int assignedId, @JsonProperty(value = "Messages") String[] messages, @JsonProperty(value = "Success") Boolean success) {
        super(Arrays.toString(messages));
    }

    
    private static final long serialVersionUID = 1L;

    
}
