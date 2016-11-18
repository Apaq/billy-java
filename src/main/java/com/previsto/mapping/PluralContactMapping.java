package com.previsto.mapping;

import com.previsto.exception.ApiException;
import com.previsto.exception.BillyException;
import com.previsto.exception.UnknownException;
import com.previsto.model.Contact;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class PluralContactMapping extends ContactMapping implements PluralMapping<Contact>{
    private List<Contact> contacts;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public Page<Contact> getPage() {
        Paging paging = getMeta().getPaging();
        Pageable pageable = null;
        int total = -1;
        if(paging != null) {
            pageable = new PageRequest(paging.page - 1, paging.pageSize);
            total = paging.total;
        }
        
        contacts.forEach(c -> resolveExtraData(c));
        
        return new PageImpl(contacts, pageable, total);
    }
    
    
}
