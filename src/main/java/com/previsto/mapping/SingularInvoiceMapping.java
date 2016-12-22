package com.previsto.mapping;

import com.previsto.model.Invoice;

public class SingularInvoiceMapping extends InvoiceMapping implements SingularMapping<Invoice> {
    private Invoice invoice;

    public Invoice getContact() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public Invoice getEntity() {
        return invoice;
    }

}
