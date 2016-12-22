package com.previsto.mapping;

import com.previsto.model.Contact;

public abstract class BaseMapping<T> {

    protected ResponseMeta meta;

    public ResponseMeta getMeta() {
        return meta;
    }
    
    public void setMeta(ResponseMeta meta) {
        this.meta = meta;
    }

    protected void resolveExtraData(T entity) {
        
    }
}
