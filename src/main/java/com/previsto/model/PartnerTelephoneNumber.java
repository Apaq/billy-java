package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartnerTelephoneNumber extends Entity {

    Long partnerId;
    String name;
    String number;
    @JsonProperty("SMS")
    Boolean sms;

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getSms() {
        return sms;
    }

    public void setSms(Boolean sms) {
        this.sms = sms;
    }
    
    
}
