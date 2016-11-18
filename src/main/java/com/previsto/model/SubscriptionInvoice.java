package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import static com.previsto.BillyClient.EPOCH;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class SubscriptionInvoice extends Fiscal {

    private Long id;
    private long orderId;
    private long subscriptionId;
    private int orderNumber;
    private Integer invoiceNumber;
    private Long orderInvoiceTransactionId;
    private Long orderJournalEntryId;
    private Long settlementId;
    private Double priceNettTotal;
    private Integer invoicingDateDays;
    private SubscriptionInvoiceState state;
    private Long documentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }
    
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Long getOrderInvoiceTransactionId() {
        return orderInvoiceTransactionId;
    }

    public void setOrderInvoiceTransactionId(Long orderInvoiceTransactionId) {
        this.orderInvoiceTransactionId = orderInvoiceTransactionId;
    }

    public Long getOrderJournalEntryId() {
        return orderJournalEntryId;
    }

    public void setOrderJournalEntryId(Long orderJournalEntryId) {
        this.orderJournalEntryId = orderJournalEntryId;
    }

    public Long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    public Double getPriceNettTotal() {
        return priceNettTotal;
    }

    public void setPriceNettTotal(Double priceNettTotal) {
        this.priceNettTotal = priceNettTotal;
    }

    public Integer getInvoicingDateDays() {
        return invoicingDateDays;
    }

    public void setInvoicingDateDays(Integer invoicingDateDays) {
        this.invoicingDateDays = invoicingDateDays;
    }
    
    @JsonIgnore
    public LocalDate getInvoicingDate() {
        return LocalDate.of(1970, Month.JANUARY, 1).plusDays(invoicingDateDays);
    }
    
    public void setInvoicingDate(LocalDate date) {
        if(date == null) {
            this.invoicingDateDays = null;
        } else {
            this.invoicingDateDays = (int) ChronoUnit.DAYS.between(EPOCH, date);
        }
        
    }

    public SubscriptionInvoiceState getState() {
        return state;
    }

    public void setState(SubscriptionInvoiceState state) {
        this.state = state;
    }

    
}
