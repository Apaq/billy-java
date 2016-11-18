package com.previsto.model;

public class OrderSetup {
    private double defaultQuantity = 1;
    private Long defaultUnitId;

    public double getDefaultQuantity() {
        return defaultQuantity;
    }

    public void setDefaultQuantity(double defaultQuantity) {
        this.defaultQuantity = defaultQuantity;
    }

    public Long getDefaultUnitId() {
        return defaultUnitId;
    }

    public void setDefaultUnitId(Long defaultUnitId) {
        this.defaultUnitId = defaultUnitId;
    }
    
}
