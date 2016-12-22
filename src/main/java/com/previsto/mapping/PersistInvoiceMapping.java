package com.previsto.mapping;

import com.previsto.model.Invoice;

public class PersistInvoiceMapping implements PersistMapping<Invoice> {
    private Invoice invoice;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void setEntity(Invoice entity) {
        this.invoice = entity;
    }
    
    
}
