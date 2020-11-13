package dk.apaq.billy.mapping;

import dk.apaq.billy.model.Contact;
import dk.apaq.billy.model.ContactPerson;

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
