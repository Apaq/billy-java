package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum IntervalType {
    @JsonProperty("IntervalType_Days") 
    Days, 
    @JsonProperty("IntervalType_Weeks") 
    Weeks, 
    @JsonProperty("IntervalType_Months") 
    Months, 
    @JsonProperty("IntervalType_Years") 
    Years
}
