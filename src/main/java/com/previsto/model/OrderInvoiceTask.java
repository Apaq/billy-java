package com.previsto.model;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderInvoiceTask {

    private Long id;
    private String description;
    private String details;
    private boolean printDetails;
    private long transactionId;
    private List<OrderLine> orderLines;
    private int index;
    private Totals totals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isPrintDetails() {
        return printDetails;
    }

    public void setPrintDetails(boolean printDetails) {
        this.printDetails = printDetails;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
