package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Order extends Entity {

    private Long partnerId;
    private String ourReference;
    private String yourReference;
    private ContextType contextType = ContextType.Customer;
    private Address address;
    private Address deliveryAddress;
    private int orderNumber;
    private Integer dateDays;
    private String currencyAbbreviation;
    private Long offerReportLayoutId;
    private Long deliveryReportLayoutId;
    private Long invoiceReportLayoutId;
    private Long confirmationReportLayoutId;
    private String offerReportLayoutName;
    private String deliveryReportLayoutName;
    private String invoiceReportLayoutName;
    private String confirmationReportLayoutName;
    public TermsOfPayment termsOfPayment;
    private String culture;
    private Long responsibleId;
    private String invoiceEmail;
    private String partnerAccountNumber;
    private String partnerName;
    private String partnerNote;
    private String partnerPhoneNumber;
    private String partnerType;

    private OrderSummary summary;
    private List<Integer> orderInvoiceNumbers;
    private Long departmentId;
    private String departmentDescription;
    private Long bearerId;
    private String bearerDescription;
    private Long purposeId;
    private String purposeDescription;
    @JsonProperty("isHeaderReadOnly")
    private boolean headerReadOnly;
    private Long orderStatusId;
    private String orderStatusName;
    private String orderStatusColor;
    private String orderDeliveryStatus;

    private List<OrderTask> orderTasks = new ArrayList<>();
    private List<OrderJournalEntry> journalEntrys = new ArrayList<>();

    public Order() {
    }
    
    public Order(Article article, String description) {
        OrderTask task = new OrderTask();
        OrderLine line = new OrderLine();
        line.setArticleId(article.getId());
        line.setDescription(bearerDescription);
        
        task.getOrderLines().add(line);
        orderTasks.add(task);
    }

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getOurReference() {
        return ourReference;
    }

    public void setOurReference(String ourReference) {
        this.ourReference = ourReference;
    }

    public String getYourReference() {
        return yourReference;
    }

    public void setYourReference(String yourReference) {
        this.yourReference = yourReference;
    }

    public ContextType getContextType() {
        return contextType;
    }

    public void setContextType(ContextType contextType) {
        this.contextType = contextType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getDateDays() {
        return dateDays;
    }

    public void setDateDays(Integer dateDays) {
        this.dateDays = dateDays;
    }

    public String getCurrencyAbbreviation() {
        return currencyAbbreviation;
    }

    public void setCurrencyAbbreviation(String currencyAbbreviation) {
        this.currencyAbbreviation = currencyAbbreviation;
    }

    public Long getOfferReportLayoutId() {
        return offerReportLayoutId;
    }

    public void setOfferReportLayoutId(Long offerReportLayoutId) {
        this.offerReportLayoutId = offerReportLayoutId;
    }

    public Long getDeliveryReportLayoutId() {
        return deliveryReportLayoutId;
    }

    public void setDeliveryReportLayoutId(Long deliveryReportLayoutId) {
        this.deliveryReportLayoutId = deliveryReportLayoutId;
    }

    public Long getInvoiceReportLayoutId() {
        return invoiceReportLayoutId;
    }

    public void setInvoiceReportLayoutId(Long invoiceReportLayoutId) {
        this.invoiceReportLayoutId = invoiceReportLayoutId;
    }

    public Long getConfirmationReportLayoutId() {
        return confirmationReportLayoutId;
    }

    public void setConfirmationReportLayoutId(Long confirmationReportLayoutId) {
        this.confirmationReportLayoutId = confirmationReportLayoutId;
    }

    public String getOfferReportLayoutName() {
        return offerReportLayoutName;
    }

    public void setOfferReportLayoutName(String offerReportLayoutName) {
        this.offerReportLayoutName = offerReportLayoutName;
    }

    public String getDeliveryReportLayoutName() {
        return deliveryReportLayoutName;
    }

    public void setDeliveryReportLayoutName(String deliveryReportLayoutName) {
        this.deliveryReportLayoutName = deliveryReportLayoutName;
    }

    public String getInvoiceReportLayoutName() {
        return invoiceReportLayoutName;
    }

    public void setInvoiceReportLayoutName(String invoiceReportLayoutName) {
        this.invoiceReportLayoutName = invoiceReportLayoutName;
    }

    public String getConfirmationReportLayoutName() {
        return confirmationReportLayoutName;
    }

    public void setConfirmationReportLayoutName(String confirmationReportLayoutName) {
        this.confirmationReportLayoutName = confirmationReportLayoutName;
    }

    public TermsOfPayment getTermsOfPayment() {
        return termsOfPayment;
    }

    public void setTermsOfPayment(TermsOfPayment termsOfPayment) {
        this.termsOfPayment = termsOfPayment;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public Long getResponsibleId() {
        return responsibleId;
    }

    public void setResponsibleId(Long responsibleId) {
        this.responsibleId = responsibleId;
    }

    public String getInvoiceEmail() {
        return invoiceEmail;
    }

    public void setInvoiceEmail(String invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
    }

    public String getPartnerAccountNumber() {
        return partnerAccountNumber;
    }

    public void setPartnerAccountNumber(String partnerAccountNumber) {
        this.partnerAccountNumber = partnerAccountNumber;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerNote() {
        return partnerNote;
    }

    public void setPartnerNote(String partnerNote) {
        this.partnerNote = partnerNote;
    }

    public String getPartnerPhoneNumber() {
        return partnerPhoneNumber;
    }

    public void setPartnerPhoneNumber(String partnerPhoneNumber) {
        this.partnerPhoneNumber = partnerPhoneNumber;
    }

    public String getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType;
    }

    public OrderSummary getSummary() {
        return summary;
    }

    public void setSummary(OrderSummary summary) {
        this.summary = summary;
    }

    public List<Integer> getOrderInvoiceNumbers() {
        return orderInvoiceNumbers;
    }

    public void setOrderInvoiceNumbers(List<Integer> orderInvoiceNumbers) {
        this.orderInvoiceNumbers = orderInvoiceNumbers;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public Long getBearerId() {
        return bearerId;
    }

    public void setBearerId(Long bearerId) {
        this.bearerId = bearerId;
    }

    public String getBearerDescription() {
        return bearerDescription;
    }

    public void setBearerDescription(String bearerDescription) {
        this.bearerDescription = bearerDescription;
    }

    public Long getPurposeId() {
        return purposeId;
    }

    public void setPurposeId(Long purposeId) {
        this.purposeId = purposeId;
    }

    public String getPurposeDescription() {
        return purposeDescription;
    }

    public void setPurposeDescription(String purposeDescription) {
        this.purposeDescription = purposeDescription;
    }

    public boolean isHeaderReadOnly() {
        return headerReadOnly;
    }

    public void setHeaderReadOnly(boolean headerReadOnly) {
        this.headerReadOnly = headerReadOnly;
    }

    public Long getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Long orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getOrderStatusColor() {
        return orderStatusColor;
    }

    public void setOrderStatusColor(String orderStatusColor) {
        this.orderStatusColor = orderStatusColor;
    }

    public String getOrderDeliveryStatus() {
        return orderDeliveryStatus;
    }

    public void setOrderDeliveryStatus(String orderDeliveryStatus) {
        this.orderDeliveryStatus = orderDeliveryStatus;
    }

    public List<OrderTask> getOrderTasks() {
        return orderTasks;
    }

    public void setOrderTasks(List<OrderTask> orderTasks) {
        this.orderTasks = orderTasks;
    }

    public List<OrderJournalEntry> getJournalEntrys() {
        return journalEntrys;
    }

    public void setJournalEntrys(List<OrderJournalEntry> journalEntrys) {
        this.journalEntrys = journalEntrys;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
