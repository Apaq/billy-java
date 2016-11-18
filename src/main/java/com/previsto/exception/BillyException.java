package com.previsto.exception;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BillyException extends RuntimeException {

    @JsonProperty(value = "StatusCode")
    private Integer statusCode;

    public BillyException(String message, Integer statusCode) {
        super(message, null);
        this.statusCode = statusCode;
    }

    public BillyException(String message, Integer statusCode, Throwable e) {
        super(message, e);
        this.statusCode = statusCode;
    }

    public BillyException(String message) {
        super(message, null);
    }

    public BillyException(String message, Throwable e) {
        super(message, e);
    }

    private static final long serialVersionUID = 1L;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

}
