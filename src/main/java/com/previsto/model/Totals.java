package com.previsto.model;

public class Totals {

    private double priceNettTotal;
    private double costTotal;
    private double discountTotal;
    private double marginTotal;
    private double vatEstTotal;

    public double getPriceNettTotal() {
        return priceNettTotal;
    }

    public void setPriceNettTotal(double priceNettTotal) {
        this.priceNettTotal = priceNettTotal;
    }

    public double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(double costTotal) {
        this.costTotal = costTotal;
    }

    public double getDiscountTotalRatio() {
        return (priceNettTotal + discountTotal) == 0.0 ? 0.0 : discountTotal/(priceNettTotal + discountTotal);
    }

    public double getDiscountTotalPct() {
        return Math.round(getDiscountTotalRatio() * 100);
    }

    public double getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(double discountTotal) {
        this.discountTotal = discountTotal;
    }

    public double getMarginTotal() {
        return marginTotal;
    }

    public void setMarginTotal(double marginTotal) {
        this.marginTotal = marginTotal;
    }

    public double getMarginTotalRatio() {
        return priceNettTotal == 0.0 ? 0.0 : marginTotal/priceNettTotal;
    }

    public double getMarginTotalPct() {
        return Math.round(getMarginTotalRatio() * 100);
    }

    public double getVatEstTotal() {
        return vatEstTotal;
    }

    public void setVatEstTotal(double vatEstTotal) {
        this.vatEstTotal = vatEstTotal;
    }
}
