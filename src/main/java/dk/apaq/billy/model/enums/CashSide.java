package dk.apaq.billy.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CashSide {
    @JsonProperty("credit")
    Credit,
    @JsonProperty("debit")
    Debit
}
