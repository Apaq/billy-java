package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PartnerType {
    @JsonProperty("xena_partnertype_person") 
    Person, 
    @JsonProperty("xena_partnertype_company") 
    Company, 
    @JsonProperty("xena_partnertype_indeterminate") 
    Indeterminate
}
