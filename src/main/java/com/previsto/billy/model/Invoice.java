package com.previsto.billy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.previsto.billy.model.enums.InvoiceSentState;
import com.previsto.billy.model.enums.InvoiceState;
import com.previsto.billy.model.enums.InvoiceTaxMode;
import com.previsto.billy.model.enums.InvoiceType;
import com.previsto.billy.model.enums.PaymentTermsMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice extends Entity {
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    protected LocalDateTime createdTime;
    
    private float amount;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    protected LocalDateTime approvedTime; 
    private String attContactPersonId;
    private float balance;
    private String contactId;
    private String contactMessage;
    private String creditedInvoiceId;
    private String currencyId;
    private String downloadUrl;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate entryDate = LocalDate.now();
    private float exchangeRate = 1f;
    private String invoiceNo;
    private boolean paid;
    private String lineDescription;
    private String orderNo;
    private Integer paymentTermsDays;
    private PaymentTermsMode paymentTermsMode;
    private String recurringInvoiceId;
    private InvoiceSentState sentState = InvoiceSentState.Unsent;
    private InvoiceState state = InvoiceState.Draft;
    private float tax;
    private InvoiceTaxMode taxMode = InvoiceTaxMode.Excluding;
    
    private List<InvoiceLine> lines = new ArrayList<>();
    private List<InvoiceAttachment> attachments = new ArrayList<>();
    private List<InvoiceLateFee> lateFees = new ArrayList<>();
    private List<BalanceModifier> balanceModifiers = new ArrayList<>();
    private InvoiceType type = InvoiceType.Invoice;

    
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
    
    @JsonIgnore
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public LocalDateTime getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(LocalDateTime approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getAttContactPersonId() {
        return attContactPersonId;
    }

    public void setAttContactPersonId(String attContactPersonId) {
        this.attContactPersonId = attContactPersonId;
    }

    @JsonIgnore
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getCreditedInvoiceId() {
        return creditedInvoiceId;
    }

    public void setCreditedInvoiceId(String creditedInvoiceId) {
        this.creditedInvoiceId = creditedInvoiceId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @JsonIgnore
    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @JsonIgnore
    public boolean isPaid() {
        return paid;
    }

    @JsonProperty("isPaid")
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getPaymentTermsDays() {
        return paymentTermsDays;
    }

    public void setPaymentTermsDays(int paymentTermsDays) {
        this.paymentTermsDays = paymentTermsDays;
    }

    public PaymentTermsMode getPaymentTermsMode() {
        return paymentTermsMode;
    }

    public void setPaymentTermsMode(PaymentTermsMode paymentTermsMode) {
        this.paymentTermsMode = paymentTermsMode;
    }

    @JsonIgnore
    public String getRecurringInvoiceId() {
        return recurringInvoiceId;
    }

    public void setRecurringInvoiceId(String recurringInvoiceId) {
        this.recurringInvoiceId = recurringInvoiceId;
    }

    public InvoiceSentState getSentState() {
        return sentState;
    }

    public void setSentState(InvoiceSentState sentState) {
        this.sentState = sentState;
    }

    public InvoiceState getState() {
        return state;
    }

    public void setState(InvoiceState state) {
        this.state = state;
    }

    @JsonIgnore
    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public InvoiceTaxMode getTaxMode() {
        return taxMode;
    }

    public void setTaxMode(InvoiceTaxMode taxMode) {
        this.taxMode = taxMode;
    }

    public List<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(List<InvoiceLine> lines) {
        this.lines = lines;
    }

    
    public List<InvoiceAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<InvoiceAttachment> attachments) {
        this.attachments = attachments;
    }

    @JsonIgnore
    public List<InvoiceLateFee> getLateFees() {
        return lateFees;
    }

    public void setLateFees(List<InvoiceLateFee> lateFees) {
        this.lateFees = lateFees;
    }

    @JsonIgnore
    public List<BalanceModifier> getBalanceModifiers() {
        return balanceModifiers;
    }

    public void setBalanceModifiers(List<BalanceModifier> balanceModifiers) {
        this.balanceModifiers = balanceModifiers;
    }

    public InvoiceType getType() {
        return type;
    }

    public void setType(InvoiceType type) {
        this.type = type;
    }
    
    
    
}
