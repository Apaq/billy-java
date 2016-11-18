package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.time.LocalDateTime;
import org.springframework.data.domain.Persistable;
import org.springframework.format.annotation.DateTimeFormat;

public abstract class Entity implements Persistable<String> {

    @JsonProperty("isArchived")
    private boolean archived;

    private String id;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    protected LocalDateTime createdTime;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    @JsonIgnore
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
