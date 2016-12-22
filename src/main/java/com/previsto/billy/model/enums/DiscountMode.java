package com.previsto.billy.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DiscountMode {
    @JsonProperty("cash_discount")
    CashDiscount,
    @JsonProperty("percentage_discount")
    PercentageDiscount
}
