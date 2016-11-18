package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DueType {
    @JsonProperty("xena_prepaid")
    PrePaid,
    @JsonProperty("xena_cash")
    Cash, 
    @JsonProperty("xena_running_month")
    RunningMonth, 
    @JsonProperty("xena_nett")
    Nett;
}
