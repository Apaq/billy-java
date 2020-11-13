package dk.apaq.billy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactPerson extends Entity {

    @JsonProperty("isPrimary")
    private boolean primary;
    private String name;
    private String email;
    private String contactId;

    public boolean isPrimary() {
        return primary;
    }

    /**
     * If contact person is primary for the parent contact.
     * @param primary
     */
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String getName() {
        return name;
    }

    /**
     * The name of the contact person. Either name or email must be set.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    /**
     * The contact person's e-mail. Used to mail invoices to the contact. Either name or email must be set.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the id of the contact this contact person belongs to.
     * @return
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the id of the contact this contact person belongs to.
     * @param contactId
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    
}
