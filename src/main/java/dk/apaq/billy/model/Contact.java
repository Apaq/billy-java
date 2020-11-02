package dk.apaq.billy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dk.apaq.billy.model.enums.ContactType;
import com.fasterxml.jackson.annotation.JsonProperty;
import dk.apaq.billy.model.enums.AttachmentDeliveryMode;
import dk.apaq.billy.model.enums.PaymentTermsMode;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contact extends ArchivableEntity {

    private ContactType type;
    private String name;
    private String countryId;
    private String street;
    private String cityId;
    private String cityText;
    private String stateText;
    private String zipcodeId;
    private String zipcodeText;
    private String contactNo;
    private String phone;
    private String fax;
    private String currencyId;
    private String registrationNo;
    private String localeId;
    private String ean;
    private LocalDateTime createdTime;
    
    @JsonProperty("isCustomer")
    private boolean customer;
    @JsonProperty("isSupplier")
    private boolean supplier;

    private PaymentTermsMode paymentTermsMode;
    private Integer paymentTermsDays = 8;

    private String accessCode;
    private AttachmentDeliveryMode emailAttachmentDeliveryMode;
    
    private List<ContactPerson> contactPersons = new ArrayList<>();
    
    public Contact() {
    }

    
    public Contact(ContactType type, String name, String countryId) {
        this.type = type;
        this.name = name;
        this.countryId = countryId;
    }

    @JsonIgnore
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    @JsonProperty
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public ContactType getType() {
        return type;
    }

    /**
     * Whether contact is a company or an person. Defaults to company
     * @param type
     */
    public void setType(ContactType type) {
        this.type = type;
    }

   

    public String getName() {
        return name;
    }

    /**
     * The name of the contact. Can be either a company name or a person's name.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getCountryId() {
        return countryId;
    }

    /**
     * The contact's home/business country.
     * @param countryId
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCityId() {
        return cityId;
    }

    /**
     * The contact's city, if finite.
     * @param cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getZipcodeId() {
        return zipcodeId;
    }

    /**
     * The contact's zipcode, if finite.
     * @param zipcodeId
     */
    public void setZipcodeId(String zipcodeId) {
        this.zipcodeId = zipcodeId;
    }

    public String getStreet() {
        return street;
    }

    /**
     * The contact's street address.
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCityText() {
        return cityText;
    }

    /**
     * 	The contact's city, in text form.
     * @param cityText
     */
    public void setCityText(String cityText) {
        this.cityText = cityText;
    }

    public String getStateText() {
        return stateText;
    }

    /**
     * The name of the contact's state, in text form.
     * @param stateText
     */
    public void setStateText(String stateText) {
        this.stateText = stateText;
    }

    public String getZipcodeText() {
        return zipcodeText;
    }

    /**
     * The contact's zipcode, in text form.
     * @param zipcodeText
     */
    public void setZipcodeText(String zipcodeText) {
        this.zipcodeText = zipcodeText;
    }

    public String getContactNo() {
        return contactNo;
    }

    /**
     * Arbitrary number (or string) that contacts can be referred to by.
     * @param contactNo
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getPhone() {
        return phone;
    }

    /**
     * The contact's phone number.
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    /**
     * The contact's fax number.
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Default currency to use for invoices created for the contact. Has no effect in the API, as currency for invoice
     * always is required.
     * @param currency
     */
    public void setCurrencyId(String currency) {
        this.currencyId = currency;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    /**
     * The contact's EU VAT number, CVR number in Denmark, tax ID (TIN/EIN/SSN) in the US.
     * @param registrationNo
     */
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getLocaleId() {
        return localeId;
    }

    /**
     * Language to use in communications with the contact. The language also decides which language should be used on
     * invoices created for the contact.
     * @param localeId
     */
    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    public String getEan() {
        return ean;
    }

    /**
     * The contact's EAN (European Article Number).
     * @param ean
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    public boolean isCustomer() {
        return customer;
    }

    /**
     * Whether the contact is regarded as a customer and can have invoices, etc.
     * @param customer
     */
    public void setCustomer(boolean customer) {
        this.customer = customer;
    }

    public boolean isSupplier() {
        return supplier;
    }

    /**
     * Whether the contact is regarded as a vendor and can have bills etc.
     * @param supplier
     */
    public void setSupplier(boolean supplier) {
        this.supplier = supplier;
    }

    public PaymentTermsMode getPaymentTermsMode() {
        return paymentTermsMode;
    }

    public void setPaymentTermsMode(PaymentTermsMode paymentTermsMode) {
        this.paymentTermsMode = paymentTermsMode;
    }

    public Integer getPaymentTermsDays() {
        return paymentTermsDays;
    }

    public void setPaymentTermsDays(Integer paymentTermsDays) {
        this.paymentTermsDays = paymentTermsDays;
    }

    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Used to generate the contact's customer portal URL.
     * @param accessCode
     */
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public AttachmentDeliveryMode getEmailAttachmentDeliveryMode() {
        return emailAttachmentDeliveryMode;
    }

    /**
     * Whether to deliver attachments by link to customer portal or with email attachments.
     * @param emailAttachmentDeliveryMode
     */
    public void setEmailAttachmentDeliveryMode(AttachmentDeliveryMode emailAttachmentDeliveryMode) {
        this.emailAttachmentDeliveryMode = emailAttachmentDeliveryMode;
    }

    public List<ContactPerson> getContactPersons() {
        return contactPersons;
    }

    /**
     * You can add one or more contact persons for the contact. If this parameter is set, any existing contact persons
     * for this contact will be deleted before adding the new ones.
     * @param contactPersons
     */
    public void setContactPersons(List<ContactPerson> contactPersons) {
        this.contactPersons = contactPersons;
    }
    
}
