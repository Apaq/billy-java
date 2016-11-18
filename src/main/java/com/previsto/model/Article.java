package com.previsto.model;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Article extends Entity {

    private List<AdditionalArticle> additionalArticles;
    private String articleNumber;
    private boolean hasVariants;
    public OrderSetup purchasingSetup = new OrderSetup();
    private String description;
    public OrderSetup salesSetup = new OrderSetup();
    private long groupId;
    private Long partnerSupplierContextId;
    private Integer supplierAccountNumber;
    private String supplierName;
    private Long supplierId;
    private Double averageCostPrice;
    private Double minimumStock;
    private Double maximumStock;
    private boolean hasInventoryManagement;
    private Boolean hasSerialNumber;
    private Boolean hasBatchNumber;
    private String articleGroupDescription;
    private String salesUnitAbbreviation;
    private String purchasingUnitAbbreviation;
    private Long defaultLocationId;
    private String defaultLocationAbbreviation;

    private Double purchasePrice;
    private String purchaseCurrencyAbbreviation;
    private Double salesPrice;
    private String salesCurrencyAbbreviation;
    private boolean advancedSalesPrices;
    private boolean advancedPurchasePrices;
    private boolean isBundle;

    public List<AdditionalArticle> getAdditionalArticles() {
        return additionalArticles;
    }

    public void setAdditionalArticles(List<AdditionalArticle> additionalArticles) {
        this.additionalArticles = additionalArticles;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public boolean isHasVariants() {
        return hasVariants;
    }

    public void setHasVariants(boolean hasVariants) {
        this.hasVariants = hasVariants;
    }

    public OrderSetup getPurchasingSetup() {
        return purchasingSetup;
    }

    public void setPurchasingSetup(OrderSetup purchasingSetup) {
        this.purchasingSetup = purchasingSetup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderSetup getSalesSetup() {
        return salesSetup;
    }

    public void setSalesSetup(OrderSetup salesSetup) {
        this.salesSetup = salesSetup;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public Long getPartnerSupplierContextId() {
        return partnerSupplierContextId;
    }

    public void setPartnerSupplierContextId(Long partnerSupplierContextId) {
        this.partnerSupplierContextId = partnerSupplierContextId;
    }

    public Integer getSupplierAccountNumber() {
        return supplierAccountNumber;
    }

    public void setSupplierAccountNumber(Integer supplierAccountNumber) {
        this.supplierAccountNumber = supplierAccountNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Double getAverageCostPrice() {
        return averageCostPrice;
    }

    public void setAverageCostPrice(Double averageCostPrice) {
        this.averageCostPrice = averageCostPrice;
    }

    public Double getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(Double minimumStock) {
        this.minimumStock = minimumStock;
    }

    public Double getMaximumStock() {
        return maximumStock;
    }

    public void setMaximumStock(Double maximumStock) {
        this.maximumStock = maximumStock;
    }

    public boolean isHasInventoryManagement() {
        return hasInventoryManagement;
    }

    public void setHasInventoryManagement(boolean hasInventoryManagement) {
        this.hasInventoryManagement = hasInventoryManagement;
    }

    public Boolean getHasSerialNumber() {
        return hasSerialNumber;
    }

    public void setHasSerialNumber(Boolean hasSerialNumber) {
        this.hasSerialNumber = hasSerialNumber;
    }

    public Boolean getHasBatchNumber() {
        return hasBatchNumber;
    }

    public void setHasBatchNumber(Boolean hasBatchNumber) {
        this.hasBatchNumber = hasBatchNumber;
    }

    public String getArticleGroupDescription() {
        return articleGroupDescription;
    }

    public void setArticleGroupDescription(String articleGroupDescription) {
        this.articleGroupDescription = articleGroupDescription;
    }

    public String getSalesUnitAbbreviation() {
        return salesUnitAbbreviation;
    }

    public void setSalesUnitAbbreviation(String salesUnitAbbreviation) {
        this.salesUnitAbbreviation = salesUnitAbbreviation;
    }

    public String getPurchasingUnitAbbreviation() {
        return purchasingUnitAbbreviation;
    }

    public void setPurchasingUnitAbbreviation(String purchasingUnitAbbreviation) {
        this.purchasingUnitAbbreviation = purchasingUnitAbbreviation;
    }

    public Long getDefaultLocationId() {
        return defaultLocationId;
    }

    public void setDefaultLocationId(Long defaultLocationId) {
        this.defaultLocationId = defaultLocationId;
    }

    public String getDefaultLocationAbbreviation() {
        return defaultLocationAbbreviation;
    }

    public void setDefaultLocationAbbreviation(String defaultLocationAbbreviation) {
        this.defaultLocationAbbreviation = defaultLocationAbbreviation;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseCurrencyAbbreviation() {
        return purchaseCurrencyAbbreviation;
    }

    public void setPurchaseCurrencyAbbreviation(String purchaseCurrencyAbbreviation) {
        this.purchaseCurrencyAbbreviation = purchaseCurrencyAbbreviation;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getSalesCurrencyAbbreviation() {
        return salesCurrencyAbbreviation;
    }

    public void setSalesCurrencyAbbreviation(String salesCurrencyAbbreviation) {
        this.salesCurrencyAbbreviation = salesCurrencyAbbreviation;
    }

    public boolean isAdvancedSalesPrices() {
        return advancedSalesPrices;
    }

    public void setAdvancedSalesPrices(boolean advancedSalesPrices) {
        this.advancedSalesPrices = advancedSalesPrices;
    }

    public boolean isAdvancedPurchasePrices() {
        return advancedPurchasePrices;
    }

    public void setAdvancedPurchasePrices(boolean advancedPurchasePrices) {
        this.advancedPurchasePrices = advancedPurchasePrices;
    }

    public boolean isIsBundle() {
        return isBundle;
    }

    public void setIsBundle(boolean isBundle) {
        this.isBundle = isBundle;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
