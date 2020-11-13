package dk.apaq.billy.mapping;

import dk.apaq.billy.model.Contact;
import dk.apaq.billy.model.ContactPerson;
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
