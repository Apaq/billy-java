package com.previsto.model;

import org.springframework.data.domain.Persistable;

public class OrderJournalEntry implements Persistable<Long> {

    private long orderId;
    private String description;
    private OrderJournalEntryType entryType;
    private Long documentId;
    private Long orderInvoiceTransactionId;
    private Long orderDeliveryTransactionId;
    private long transactionId;
    private Integer voucherNumber;
    private String createdByName;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public boolean isNew() {
        return false;
    }

    
    
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderJournalEntryType getEntryType() {
        return entryType;
    }

    public void setEntryType(OrderJournalEntryType entryType) {
        this.entryType = entryType;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public Long getOrderInvoiceTransactionId() {
        return orderInvoiceTransactionId;
    }

    public void setOrderInvoiceTransactionId(Long orderInvoiceTransactionId) {
        this.orderInvoiceTransactionId = orderInvoiceTransactionId;
    }

    public Long getOrderDeliveryTransactionId() {
        return orderDeliveryTransactionId;
    }

    public void setOrderDeliveryTransactionId(Long orderDeliveryTransactionId) {
        this.orderDeliveryTransactionId = orderDeliveryTransactionId;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(Integer voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }
    
    
}
