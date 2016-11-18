package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SubscriptionInvoiceState {
    @JsonProperty("SubscriptionInvoiceStates_Paid")
    Paid, 
    @JsonProperty("SubscriptionInvoiceStates_Invoiced")
    Invoiced, 
    @JsonProperty("SubscriptionInvoiceStates_Open")
    Open
}
