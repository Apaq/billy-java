package com.previsto.billy.mapping;

import com.previsto.billy.model.Contact;
import com.previsto.billy.model.ContactPerson;
import org.springframework.data.domain.Page;

import java.util.List;

public class PluralContactPersonMapping extends BaseMapping<ContactPerson> implements PluralMapping<ContactPerson>{
    private List<ContactPerson> contactPersons;

    public List<ContactPerson> getContactPersons() {
        return contactPersons;
    }

    public void setContacts(List<ContactPerson> contactPersons) {
        this.contactPersons = contactPersons;
    }

    @Override
    public Page<ContactPerson> getPage() {
        return BaseMapping.resolvePage(getMeta(), contactPersons);
    }
    
    
}
