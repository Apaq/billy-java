package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Entity extends Fiscal {
    
    
    private int version;
    
    @JsonProperty("isDeactivated")
    private boolean deactivated;
    

    
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isDeactivated() {
        return deactivated;
    }

    public void setDeactivated(boolean deactivated) {
        this.deactivated = deactivated;
    }
    
    
    
}