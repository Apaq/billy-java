package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;

/**
 * Xena Partner
 * 
 */
public class Partner extends Entity {
    private Integer accountNumber;
    private Address address;
    private Long referenceFiscalSetupId;
    private Long referenceUserId;
    private String attention;
    private PartnerType partnerType = PartnerType.Company;
    private String phoneNumber;
    private String note;
    private String url;
    private String GLNumber;
    private String orgNumber;
    private String supplierId;
    private String customerId;
    private String resourceId;
    private String shortDescription;
    private String longDescription;
    private List<String> tags;
    
    @JsonIgnore
    private List<OrderContext> contexts = new ArrayList<>();
    
    @JsonIgnore
    private List<PartnerTelephoneNumber> telephoneNumbers = new ArrayList<>();
    
    public boolean hasContextType(ContextType type) {
        return getContext(type) != null;
    }
    
    public OrderContext getContext(ContextType type) {
        for(OrderContext context : contexts) {
            if(context.getContextType() == type) {
                return context;
            }
        }
        return null;
    }
    
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getReferenceFiscalSetupId() {
        return referenceFiscalSetupId;
    }

    public void setReferenceFiscalSetupId(Long referenceFiscalSetupId) {
        this.referenceFiscalSetupId = referenceFiscalSetupId;
    }

    public Long getReferenceUserId() {
        return referenceUserId;
    }

    public void setReferenceUserId(Long referenceUserId) {
        this.referenceUserId = referenceUserId;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public PartnerType getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(PartnerType partnerType) {
        this.partnerType = partnerType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGLNumber() {
        return GLNumber;
    }

    public void setGLNumber(String GLNumber) {
        this.GLNumber = GLNumber;
    }

    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<OrderContext> getContexts() {
        return contexts;
    }

    public void setContexts(List<OrderContext> contexts) {
        this.contexts = contexts;
    }

    public List<PartnerTelephoneNumber> getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void setTelephoneNumbers(List<PartnerTelephoneNumber> telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }
    
    
}
