package com.previsto.billy.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CashSide {
    @JsonProperty("debit")
    Credit,
    @JsonProperty("credit")
    Debit
}
