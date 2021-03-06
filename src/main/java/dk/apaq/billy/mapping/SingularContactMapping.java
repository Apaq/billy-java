package dk.apaq.billy.mapping;

import dk.apaq.billy.model.Contact;

public class SingularContactMapping extends ContactMapping implements SingularMapping<Contact> {
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public Contact getEntity() {
        resolveExtraData(contact);
        return contact;
    }

}
