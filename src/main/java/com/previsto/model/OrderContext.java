package com.previsto.model;

import java.util.Locale;

public class OrderContext extends Entity {

    private ContextType contextType;
    private long partnerId;
    public TermsOfPayment termsOfPayment;
    private String currencyAbbreviation;
    private String invoiceEmail;
    private Long offerReportLayoutId;
    private Long deliveryReportLayoutId;
    private Long invoiceReportLayoutId;
    private Long confirmationReportLayoutId;
    private String offerReportLayoutName;
    private String deliveryReportLayoutName;
    private String invoiceReportLayoutName;
    private String confirmationReportLayoutName;
    private Long priceGroupId;
    private String priceGroupDescription;
    private String articleGroupDescription;
    private String ledgerTagNumber;
    private String ledgerTagDescription;
    private Locale culture;
    private Long defaultArticleGroupId;
    private Long defaultLedgerTagId;

    public OrderContext() {
    }
    
    public OrderContext(ContextType type) {
        this.contextType = type;
    }
    

    public ContextType getContextType() {
        return contextType;
    }

    public void setContextType(ContextType ContextType) {
        this.contextType = ContextType;
    }

    public long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(long partnerId) {
        this.partnerId = partnerId;
    }

    public TermsOfPayment getTermsOfPayment() {
        return termsOfPayment;
    }

    public void setTermsOfPayment(TermsOfPayment termsOfPayment) {
        this.termsOfPayment = termsOfPayment;
    }

    public String getCurrencyAbbreviation() {
        return currencyAbbreviation;
    }

    public void setCurrencyAbbreviation(String currencyAbbreviation) {
        this.currencyAbbreviation = currencyAbbreviation;
    }

    public String getInvoiceEmail() {
        return invoiceEmail;
    }

    public void setInvoiceEmail(String invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
    }

    public Long getOfferReportLayoutId() {
        return offerReportLayoutId;
    }

    public void setOfferReportLayoutId(Long offerReportLayoutId) {
        this.offerReportLayoutId = offerReportLayoutId;
    }

    public Long getDeliveryReportLayoutId() {
        return deliveryReportLayoutId;
    }

    public void setDeliveryReportLayoutId(Long deliveryReportLayoutId) {
        this.deliveryReportLayoutId = deliveryReportLayoutId;
    }

    public Long getInvoiceReportLayoutId() {
        return invoiceReportLayoutId;
    }

    public void setInvoiceReportLayoutId(Long invoiceReportLayoutId) {
        this.invoiceReportLayoutId = invoiceReportLayoutId;
    }

    public Long getConfirmationReportLayoutId() {
        return confirmationReportLayoutId;
    }

    public void setConfirmationReportLayoutId(Long confirmationReportLayoutId) {
        this.confirmationReportLayoutId = confirmationReportLayoutId;
    }

    public String getOfferReportLayoutName() {
        return offerReportLayoutName;
    }

    public void setOfferReportLayoutName(String offerReportLayoutName) {
        this.offerReportLayoutName = offerReportLayoutName;
    }

    public String getDeliveryReportLayoutName() {
        return deliveryReportLayoutName;
    }

    public void setDeliveryReportLayoutName(String deliveryReportLayoutName) {
        this.deliveryReportLayoutName = deliveryReportLayoutName;
    }

    public String getInvoiceReportLayoutName() {
        return invoiceReportLayoutName;
    }

    public void setInvoiceReportLayoutName(String invoiceReportLayoutName) {
        this.invoiceReportLayoutName = invoiceReportLayoutName;
    }

    public String getConfirmationReportLayoutName() {
        return confirmationReportLayoutName;
    }

    public void setConfirmationReportLayoutName(String confirmationReportLayoutName) {
        this.confirmationReportLayoutName = confirmationReportLayoutName;
    }

    public Long getPriceGroupId() {
        return priceGroupId;
    }

    public void setPriceGroupId(Long priceGroupId) {
        this.priceGroupId = priceGroupId;
    }

    public String getPriceGroupDescription() {
        return priceGroupDescription;
    }

    public void setPriceGroupDescription(String priceGroupDescription) {
        this.priceGroupDescription = priceGroupDescription;
    }

    public String getArticleGroupDescription() {
        return articleGroupDescription;
    }

    public void setArticleGroupDescription(String articleGroupDescription) {
        this.articleGroupDescription = articleGroupDescription;
    }

    public String getLedgerTagNumber() {
        return ledgerTagNumber;
    }

    public void setLedgerTagNumber(String ledgerTagNumber) {
        this.ledgerTagNumber = ledgerTagNumber;
    }

    public String getLedgerTagDescription() {
        return ledgerTagDescription;
    }

    public void setLedgerTagDescription(String ledgerTagDescription) {
        this.ledgerTagDescription = ledgerTagDescription;
    }

    public Locale getCulture() {
        return culture;
    }

    public void setCulture(Locale culture) {
        this.culture = culture;
    }

    public Long getDefaultArticleGroupId() {
        return defaultArticleGroupId;
    }

    public void setDefaultArticleGroupId(Long defaultArticleGroupId) {
        this.defaultArticleGroupId = defaultArticleGroupId;
    }

    public Long getDefaultLedgerTagId() {
        return defaultLedgerTagId;
    }

    public void setDefaultLedgerTagId(Long defaultLedgerTagId) {
        this.defaultLedgerTagId = defaultLedgerTagId;
    }

}
