package com.previsto.billy.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class RequestException extends BillyException {

    @JsonCreator
    public RequestException(@JsonProperty(value = "AssignedId") int assignedId, @JsonProperty(value = "Messages") String[] messages, @JsonProperty(value = "Success") Boolean success) {
        super(Arrays.toString(messages));
    }

    public RequestException(String message) {
        super(message);
    }
    
    

    
    private static final long serialVersionUID = 1L;

    
}
