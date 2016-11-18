package com.previsto.model;

public class OrderSummary {

    private Totals totals;
    private Totals notInvoicedTotals;
    private boolean isFullyInvoiced;
    private boolean isFullyDelivered;
    private boolean isFullyConfirmed;
    private boolean canOffer;
    private boolean canDeliver;
    private boolean canInvoice;
    private boolean canPay;
    private boolean canConfirm;

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public Totals getNotInvoicedTotals() {
        return notInvoicedTotals;
    }

    public void setNotInvoicedTotals(Totals notInvoicedTotals) {
        this.notInvoicedTotals = notInvoicedTotals;
    }

    public boolean isIsFullyInvoiced() {
        return isFullyInvoiced;
    }

    public void setIsFullyInvoiced(boolean isFullyInvoiced) {
        this.isFullyInvoiced = isFullyInvoiced;
    }

    public boolean isIsFullyDelivered() {
        return isFullyDelivered;
    }

    public void setIsFullyDelivered(boolean isFullyDelivered) {
        this.isFullyDelivered = isFullyDelivered;
    }

    public boolean isIsFullyConfirmed() {
        return isFullyConfirmed;
    }

    public void setIsFullyConfirmed(boolean isFullyConfirmed) {
        this.isFullyConfirmed = isFullyConfirmed;
    }

    public boolean isCanOffer() {
        return canOffer;
    }

    public void setCanOffer(boolean canOffer) {
        this.canOffer = canOffer;
    }

    public boolean isCanDeliver() {
        return canDeliver;
    }

    public void setCanDeliver(boolean canDeliver) {
        this.canDeliver = canDeliver;
    }

    public boolean isCanInvoice() {
        return canInvoice;
    }

    public void setCanInvoice(boolean canInvoice) {
        this.canInvoice = canInvoice;
    }

    public boolean isCanPay() {
        return canPay;
    }

    public void setCanPay(boolean canPay) {
        this.canPay = canPay;
    }

    public boolean isCanConfirm() {
        return canConfirm;
    }

    public void setCanConfirm(boolean canConfirm) {
        this.canConfirm = canConfirm;
    }
    
    
}
