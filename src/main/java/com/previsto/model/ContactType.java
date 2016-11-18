package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContactType {
    @JsonProperty("company")
    Company,
    @JsonProperty("individual")
    Individual
}
