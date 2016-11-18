package com.previsto.exception;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;



public class ApiException extends BillyException {

    @JsonCreator
    public ApiException(@JsonProperty(value = "AssignedId") int assignedId, @JsonProperty(value = "Messages") String[] messages, @JsonProperty(value = "Success") Boolean success) {
        super(Arrays.toString(messages));
    }

    
    private static final long serialVersionUID = 1L;

}
