package com.previsto.model;

public class PartnerLocation extends Entity {
    Long PartnerId;
    String name;
    double longitude;
    double latitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPartnerId() {
        return PartnerId;
    }

    public void setPartnerId(Long PartnerId) {
        this.PartnerId = PartnerId;
    }
    
    
}
