package com.previsto.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderInvoiceTransaction extends Transactional {

    private long economicTransactionId;
    private OrderInvoice orderInvoice;

    public long getEconomicTransactionId() {
        return economicTransactionId;
    }

    public void setEconomicTransactionId(long economicTransactionId) {
        this.economicTransactionId = economicTransactionId;
    }

    public OrderInvoice getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(OrderInvoice orderInvoice) {
        this.orderInvoice = orderInvoice;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
}
