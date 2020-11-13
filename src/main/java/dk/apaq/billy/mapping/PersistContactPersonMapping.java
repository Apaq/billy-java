package com.previsto.billy.mapping;

import com.previsto.billy.model.Contact;
import com.previsto.billy.model.ContactPerson;

public class PersistContactPersonMapping implements PersistMapping<ContactPerson> {
    private ContactPerson contactPerson;

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public void setEntity(ContactPerson entity) {
        this.contactPerson = entity;
    }
    
}
