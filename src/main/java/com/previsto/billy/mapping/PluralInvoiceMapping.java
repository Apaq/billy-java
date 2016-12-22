package com.previsto.billy.mapping;

import com.previsto.billy.model.Invoice;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PluralInvoiceMapping extends InvoiceMapping implements PluralMapping<Invoice>{
    private List<Invoice> invoices;

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setContacts(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public Page<Invoice> getPage() {
        Paging paging = getMeta().getPaging();
        Pageable pageable = null;
        int total = -1;
        if(paging != null) {
            pageable = new PageRequest(paging.page - 1, paging.pageSize);
            total = paging.total;
        }
        
        return new PageImpl(invoices, pageable, total);
    }
    
}