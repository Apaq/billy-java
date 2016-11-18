package com.previsto.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SubscriptionLine extends Entity {

    private long subscriptionId;
    private double quantity;
    private double priceEach;
    private String description;
    private String articleNumber;
    private Long articleId;
    private Long unitId;
    private Long billedToId;
    private Double fraction;
    private Double fixedAmount;
    private Integer index;
    private double priceNettTotal;
    private double costTotal;
    private Double discount;
    private double marginTotal;
    //private double marginTotalRatio;
    //private double marginTotalPct;
    private double vatEstTotal;
    private boolean isCreatedBySystem;
    private String systemIdentifier;
    private String systemMessage;
    private Long departmentId;
    private Long purposeId;
    private Long bearerId;
    private Long articleVariantId;
    private Long locationId;
    private String departmentDescription;
    private String purposeDescription;
    private String bearerDescription;
    private String articleVariantAbbreviation;
    private String locationAbbreviation;
    private boolean articleHasInventoryManagement;
    private boolean articleHasVariants;
    //private String articleAbbreviation;
    private Long currentPriceAgreementId;
    private Long currentCostPriceAgreementId;
    private Long currentPriceDiscountAgreementId;
    private String currentPriceAgreementDescription;
    private String currentCostPriceAgreementDescription;
    private String currentPriceDiscountAgreementDescription;

    public long getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public void setPriceEach(double priceEach) {
        this.priceEach = priceEach;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getBilledToId() {
        return billedToId;
    }

    public void setBilledToId(Long billedToId) {
        this.billedToId = billedToId;
    }

    public Double getFraction() {
        return fraction;
    }

    public void setFraction(Double fraction) {
        this.fraction = fraction;
    }

    public Double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(Double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public double getMarginTotal() {
        return marginTotal;
    }

    public void setMarginTotal(double marginTotal) {
        this.marginTotal = marginTotal;
    }

    public double getVatEstTotal() {
        return vatEstTotal;
    }

    public void setVatEstTotal(double vatEstTotal) {
        this.vatEstTotal = vatEstTotal;
    }

    public boolean isIsCreatedBySystem() {
        return isCreatedBySystem;
    }

    public void setIsCreatedBySystem(boolean isCreatedBySystem) {
        this.isCreatedBySystem = isCreatedBySystem;
    }

    public String getSystemIdentifier() {
        return systemIdentifier;
    }

    public void setSystemIdentifier(String systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
    }

    public String getSystemMessage() {
        return systemMessage;
    }

    public void setSystemMessage(String systemMessage) {
        this.systemMessage = systemMessage;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getPurposeId() {
        return purposeId;
    }

    public void setPurposeId(Long purposeId) {
        this.purposeId = purposeId;
    }

    public Long getBearerId() {
        return bearerId;
    }

    public void setBearerId(Long bearerId) {
        this.bearerId = bearerId;
    }

    public Long getArticleVariantId() {
        return articleVariantId;
    }

    public void setArticleVariantId(Long articleVariantId) {
        this.articleVariantId = articleVariantId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getDepartmentDescription() {
        return departmentDescription;
    }

    public void setDepartmentDescription(String departmentDescription) {
        this.departmentDescription = departmentDescription;
    }

    public String getPurposeDescription() {
        return purposeDescription;
    }

    public void setPurposeDescription(String purposeDescription) {
        this.purposeDescription = purposeDescription;
    }

    public String getBearerDescription() {
        return bearerDescription;
    }

    public void setBearerDescription(String bearerDescription) {
        this.bearerDescription = bearerDescription;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
