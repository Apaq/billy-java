package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderJournalEntryType {
    @JsonProperty("OrderJournalEntry") 
    OrderJournal, 
    @JsonProperty("ElectronicInvoiceJournalEntry") 
    ElectronicInvoice, 
    @JsonProperty("PaymentJournal") 
    Payment
}
