package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import static com.previsto.BillyClient.EPOCH;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderInvoice {

    public long orderId;
    private int orderNumber;
    private int invoiceNumber;
    private long payerId;
    private int invoicingDateDays;
    private ContextType contextType;
    private String currencyAbbreviation;
    private List<OrderInvoiceTask> orderTasks;
    private boolean isExcemptFromVAT;
    private Totals totals;
    private int dueDateDays;
    private LocalDateTime invoiceTimeLocal;
    private Iterable<VatTotals> vatTotals;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public long getPayerId() {
        return payerId;
    }

    public void setPayerId(long payerId) {
        this.payerId = payerId;
    }

    @JsonIgnore
    public LocalDate getInvoicingDate() {
        return LocalDate.of(1970, Month.JANUARY, 1).plusDays(invoicingDateDays);
    }
    
    public int getInvoicingDateDays() {
        return invoicingDateDays;
    }
    
    public void setInvoicingDate(LocalDate date) {
        if(date == null) {
            this.invoicingDateDays = 0;
        } else {
            this.invoicingDateDays = (int) ChronoUnit.DAYS.between(EPOCH, date);
        }
    }

    public void setInvoicingDateDays(int invoicingDateDays) {
        this.invoicingDateDays = invoicingDateDays;
    }

    public ContextType getContextType() {
        return contextType;
    }

    public void setContextType(ContextType contextType) {
        this.contextType = contextType;
    }

    public String getCurrencyAbbreviation() {
        return currencyAbbreviation;
    }

    public void setCurrencyAbbreviation(String currencyAbbreviation) {
        this.currencyAbbreviation = currencyAbbreviation;
    }

    public List<OrderInvoiceTask> getOrderTasks() {
        return orderTasks;
    }

    public void setOrderTasks(List<OrderInvoiceTask> orderTasks) {
        this.orderTasks = orderTasks;
    }

    public boolean isIsExcemptFromVAT() {
        return isExcemptFromVAT;
    }

    public void setIsExcemptFromVAT(boolean isExcemptFromVAT) {
        this.isExcemptFromVAT = isExcemptFromVAT;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public int getDueDateDays() {
        return dueDateDays;
    }

    public void setDueDateDays(int dueDateDays) {
        this.dueDateDays = dueDateDays;
    }

    public LocalDateTime getInvoiceTimeLocal() {
        return invoiceTimeLocal;
    }

    public void setInvoiceTimeLocal(LocalDateTime invoiceTimeLocal) {
        this.invoiceTimeLocal = invoiceTimeLocal;
    }

    public Iterable<VatTotals> getVatTotals() {
        return vatTotals;
    }

    public void setVatTotals(Iterable<VatTotals> vatTotals) {
        this.vatTotals = vatTotals;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
}
