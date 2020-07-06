package dk.apaq.billy.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum InvoiceTaxMode {
    @JsonProperty("incl")
    Including,
    @JsonProperty("excl")
    Excluding
}
