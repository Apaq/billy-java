package com.previsto.billy.mapping;

import com.previsto.billy.model.Contact;

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
