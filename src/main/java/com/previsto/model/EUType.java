package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum EUType {
    @JsonProperty("EUType_Goods")
    Goods,
    @JsonProperty("EUType_Services")
    Service,
    @JsonProperty("EUType_None")
    None
    
}
