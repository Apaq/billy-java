package com.previsto.model;

import java.time.Instant;
import org.springframework.data.domain.Persistable;
import org.springframework.format.annotation.DateTimeFormat;

public class Fiscal implements Persistable<Long> {

    private Long id;
    
    protected Long createdBy;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    protected Instant createdAt;
    protected long fiscalSetupId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Instant getCreatedAt() {
        return createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public long getFiscalSetupId() {
        return fiscalSetupId;
    }

    public void setFiscalSetupId(long fiscalSetupId) {
        this.fiscalSetupId = fiscalSetupId;
    }

    @Override
    public boolean isNew() {
        return id == null;
    }

}
