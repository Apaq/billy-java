package com.previsto.billy.mapping;

import com.previsto.billy.model.Contact;
import com.previsto.billy.model.ContactPerson;

public class SingularContactPersonMapping extends BaseMapping<ContactPerson> implements SingularMapping<ContactPerson> {
    private ContactPerson contactPerson;

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContact(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }

    @Override
    public ContactPerson getEntity() {
        return contactPerson;
    }

}
