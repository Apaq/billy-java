package dk.apaq.billy.mapping;

import dk.apaq.billy.model.Contact;
import dk.apaq.billy.model.ContactPerson;

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
