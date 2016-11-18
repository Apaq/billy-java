package com.previsto.model;

public class SubscriptionTicket extends Fiscal {

    private long subscriptionId;
    private String ticketId;
    private String cardNumberMasked;
    private String cardTypeName;
    public String lastErrorMessage;

    public SubscriptionTicket(String ticketId, String cardNumberMasked, String cardTypeName) {
        this.ticketId = ticketId;
        this.cardNumberMasked = cardNumberMasked;
        this.cardTypeName = cardTypeName;
    }

    public SubscriptionTicket() {
    }

    public long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCardNumberMasked() {
        return cardNumberMasked;
    }

    public void setCardNumberMasked(String cardNumberMasked) {
        this.cardNumberMasked = cardNumberMasked;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    
}
