package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderLine extends Entity {

    private Long locationId;
    private Long orderInvoiceTaskId;
    private long orderTaskId;
    private Integer index;
    private Long articleId;
    private Integer invoiceDateDays;
    private double costEach;
    private String description;
    private double priceEach;
    private double quantity;
    private Long unitId;
    private Long payerId;
    private Integer payerAccountNumber;
    private String unitAbbreviation;
    private String articleNumber;
    public Totals totals;
    private Long articleGroupId;
    private Long articleVariantId;
    private String articleGroupDescription;
    private boolean articleHasInventoryManagement;
    private boolean articleHasVariants;
    private boolean articleIsBundle;
    private String articleVariantAbbreviation;
    private String locationAbbreviation;
    private String articleStatus;
    private Long currentPriceAgreementId;
    private Long currentCostPriceAgreementId;
    private Long currentPriceDiscountAgreementId;
    private Long orderDeliveryTransactionId;
    private String currentPriceAgreementDescription;
    private String currentCostPriceAgreementDescription;
    private String currentPriceDiscountAgreementDescription;
    private Long articleMappingId;
    private Double articleMappingQuantity;
    private String partnerArticleNumber;
    @JsonProperty("isConfirmed")
    private boolean confirmed;
    @JsonProperty("isDelivered")
    private boolean delivered;

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Long getOrderInvoiceTaskId() {
        return orderInvoiceTaskId;
    }

    public void setOrderInvoiceTaskId(Long orderInvoiceTaskId) {
        this.orderInvoiceTaskId = orderInvoiceTaskId;
    }

    public long getOrderTaskId() {
        return orderTaskId;
    }

    public void setOrderTaskId(long orderTaskId) {
        this.orderTaskId = orderTaskId;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Integer getInvoiceDateDays() {
        return invoiceDateDays;
    }

    public void setInvoiceDateDays(Integer invoiceDateDays) {
        this.invoiceDateDays = invoiceDateDays;
    }

    public double getCostEach() {
        return costEach;
    }

    public void setCostEach(double costEach) {
        this.costEach = costEach;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getPayerId() {
        return payerId;
    }

    public void setPayerId(Long payerId) {
        this.payerId = payerId;
    }

    public Integer getPayerAccountNumber() {
        return payerAccountNumber;
    }

    public void setPayerAccountNumber(Integer payerAccountNumber) {
        this.payerAccountNumber = payerAccountNumber;
    }

    public String getUnitAbbreviation() {
        return unitAbbreviation;
    }

    public void setUnitAbbreviation(String unitAbbreviation) {
        this.unitAbbreviation = unitAbbreviation;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    public Long getArticleGroupId() {
        return articleGroupId;
    }

    public void setArticleGroupId(Long articleGroupId) {
        this.articleGroupId = articleGroupId;
    }

    public Long getArticleVariantId() {
        return articleVariantId;
    }

    public void setArticleVariantId(Long articleVariantId) {
        this.articleVariantId = articleVariantId;
    }

    public String getArticleGroupDescription() {
        return articleGroupDescription;
    }

    public void setArticleGroupDescription(String articleGroupDescription) {
        this.articleGroupDescription = articleGroupDescription;
    }

    public boolean isArticleHasInventoryManagement() {
        return articleHasInventoryManagement;
    }

    public void setArticleHasInventoryManagement(boolean articleHasInventoryManagement) {
        this.articleHasInventoryManagement = articleHasInventoryManagement;
    }

    public boolean isArticleHasVariants() {
        return articleHasVariants;
    }

    public void setArticleHasVariants(boolean articleHasVariants) {
        this.articleHasVariants = articleHasVariants;
    }

    public boolean isArticleIsBundle() {
        return articleIsBundle;
    }

    public void setArticleIsBundle(boolean articleIsBundle) {
        this.articleIsBundle = articleIsBundle;
    }

    public String getArticleVariantAbbreviation() {
        return articleVariantAbbreviation;
    }

    public void setArticleVariantAbbreviation(String articleVariantAbbreviation) {
        this.articleVariantAbbreviation = articleVariantAbbreviation;
    }

    public String getLocationAbbreviation() {
        return locationAbbreviation;
    }

    public void setLocationAbbreviation(String locationAbbreviation) {
        this.locationAbbreviation = locationAbbreviation;
    }

    public String getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(String articleStatus) {
        this.articleStatus = articleStatus;
    }

    public Long getCurrentPriceAgreementId() {
        return currentPriceAgreementId;
    }

    public void setCurrentPriceAgreementId(Long currentPriceAgreementId) {
        this.currentPriceAgreementId = currentPriceAgreementId;
    }

    public Long getCurrentCostPriceAgreementId() {
        return currentCostPriceAgreementId;
    }

    public void setCurrentCostPriceAgreementId(Long currentCostPriceAgreementId) {
        this.currentCostPriceAgreementId = currentCostPriceAgreementId;
    }

    public Long getCurrentPriceDiscountAgreementId() {
        return currentPriceDiscountAgreementId;
    }

    public void setCurrentPriceDiscountAgreementId(Long currentPriceDiscountAgreementId) {
        this.currentPriceDiscountAgreementId = currentPriceDiscountAgreementId;
    }

    public Long getOrderDeliveryTransactionId() {
        return orderDeliveryTransactionId;
    }

    public void setOrderDeliveryTransactionId(Long orderDeliveryTransactionId) {
        this.orderDeliveryTransactionId = orderDeliveryTransactionId;
    }

    public String getCurrentPriceAgreementDescription() {
        return currentPriceAgreementDescription;
    }

    public void setCurrentPriceAgreementDescription(String currentPriceAgreementDescription) {
        this.currentPriceAgreementDescription = currentPriceAgreementDescription;
    }

    public String getCurrentCostPriceAgreementDescription() {
        return currentCostPriceAgreementDescription;
    }

    public void setCurrentCostPriceAgreementDescription(String currentCostPriceAgreementDescription) {
        this.currentCostPriceAgreementDescription = currentCostPriceAgreementDescription;
    }

    public String getCurrentPriceDiscountAgreementDescription() {
        return currentPriceDiscountAgreementDescription;
    }

    public void setCurrentPriceDiscountAgreementDescription(String currentPriceDiscountAgreementDescription) {
        this.currentPriceDiscountAgreementDescription = currentPriceDiscountAgreementDescription;
    }

    public Long getArticleMappingId() {
        return articleMappingId;
    }

    public void setArticleMappingId(Long articleMappingId) {
        this.articleMappingId = articleMappingId;
    }

    public Double getArticleMappingQuantity() {
        return articleMappingQuantity;
    }

    public void setArticleMappingQuantity(Double articleMappingQuantity) {
        this.articleMappingQuantity = articleMappingQuantity;
    }

    public String getPartnerArticleNumber() {
        return partnerArticleNumber;
    }

    public void setPartnerArticleNumber(String partnerArticleNumber) {
        this.partnerArticleNumber = partnerArticleNumber;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
    
    
}
