package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContextType {
    @JsonProperty("ContextType_Customer")
    Customer,
    @JsonProperty("ContextType_Supplier")
    Supplier; 
}
