package com.previsto.billy.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum InvoiceState {
    @JsonProperty("draft")
    Draft, 
    @JsonProperty("approved")
    Approved
}
