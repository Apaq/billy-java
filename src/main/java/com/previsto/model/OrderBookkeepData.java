package com.previsto.model;

public class OrderBookkeepData {

    private int version;
    private Integer invoicingDate;
    private String supplierInvoiceNumber;
    private boolean doDeliver = false;
    private boolean printInvoice = true;
    private boolean printDelivery = false;
    private Long invoiceReportLayoutId;
    private Long deliveryReportLayoutId;
    public Iterable<LedgerPostDraft> ledgerPostDrafts;
    private long[] orderTaskIds;

    public OrderBookkeepData(int version, long[] orderTaskIds) {
        this.orderTaskIds = orderTaskIds;
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Integer getInvoicingDate() {
        return invoicingDate;
    }

    public void setInvoicingDate(Integer invoicingDate) {
        this.invoicingDate = invoicingDate;
    }

    public String getSupplierInvoiceNumber() {
        return supplierInvoiceNumber;
    }

    public void setSupplierInvoiceNumber(String supplierInvoiceNumber) {
        this.supplierInvoiceNumber = supplierInvoiceNumber;
    }

    public boolean isDoDeliver() {
        return doDeliver;
    }

    public void setDoDeliver(boolean doDeliver) {
        this.doDeliver = doDeliver;
    }

    public boolean isPrintInvoice() {
        return printInvoice;
    }

    public void setPrintInvoice(boolean printInvoice) {
        this.printInvoice = printInvoice;
    }

    public boolean isPrintDelivery() {
        return printDelivery;
    }

    public void setPrintDelivery(boolean printDelivery) {
        this.printDelivery = printDelivery;
    }

    public Long getInvoiceReportLayoutId() {
        return invoiceReportLayoutId;
    }

    public void setInvoiceReportLayoutId(Long invoiceReportLayoutId) {
        this.invoiceReportLayoutId = invoiceReportLayoutId;
    }

    public Long getDeliveryReportLayoutId() {
        return deliveryReportLayoutId;
    }

    public void setDeliveryReportLayoutId(Long deliveryReportLayoutId) {
        this.deliveryReportLayoutId = deliveryReportLayoutId;
    }

    public Iterable<LedgerPostDraft> getLedgerPostDrafts() {
        return ledgerPostDrafts;
    }

    public void setLedgerPostDrafts(Iterable<LedgerPostDraft> ledgerPostDrafts) {
        this.ledgerPostDrafts = ledgerPostDrafts;
    }

    public long[] getOrderTaskIds() {
        return orderTaskIds;
    }

    public void setOrderTaskIds(long[] orderTaskIds) {
        this.orderTaskIds = orderTaskIds;
    }
    
    public static OrderBookkeepData fromOrder(Order order) {
        long[] taskIds = new long[order.getOrderTasks().size()];
        int index = 0;
        
        for(OrderTask task : order.getOrderTasks()) {
            taskIds[index++] = task.getId();
        }
        return new OrderBookkeepData(order.getVersion(), taskIds);
    }
    
    
}
