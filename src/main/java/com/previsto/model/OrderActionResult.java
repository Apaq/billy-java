package com.previsto.model;

public class OrderActionResult {

    private long orderId;
    private long[] journalIds;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long[] getJournalIds() {
        return journalIds;
    }

    public void setJournalIds(long[] journalIds) {
        this.journalIds = journalIds;
    }
    
    

}
