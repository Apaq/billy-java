package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import org.springframework.data.domain.Persistable;
import org.springframework.format.annotation.DateTimeFormat;

public abstract class Entity implements Persistable<String> {

    private boolean archived;

    private String id;

    protected Long createdBy;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    protected Instant createdTime;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Instant createdTime) {
        this.createdTime = createdTime;
    }

    
    @Override
    public boolean isNew() {
        return id == null;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

}
