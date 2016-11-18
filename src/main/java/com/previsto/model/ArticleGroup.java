package com.previsto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleGroup extends Entity {
    String description;
    @JsonProperty("EUType")
    EUType euType;
    @JsonProperty("EUTypeTranslated")
    String euTypeTranslated;
    Integer nettTurnoverAccount;
    Integer nettTurnoverVatFreeAccount;
    Integer productPurchaseAccount;
    Integer productPurchaseVatFreeAccount;
    Integer stockAccount;
    Integer stockReceptionAccount;
    Integer unpaidStockAccount;
    boolean defaultInventoryManagement;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EUType getEuType() {
        return euType;
    }

    public void setEuType(EUType euType) {
        this.euType = euType;
    }

    public String getEuTypeTranslated() {
        return euTypeTranslated;
    }

    public void setEuTypeTranslated(String euTypeTranslated) {
        this.euTypeTranslated = euTypeTranslated;
    }

    public Integer getNettTurnoverAccount() {
        return nettTurnoverAccount;
    }

    public void setNettTurnoverAccount(Integer nettTurnoverAccount) {
        this.nettTurnoverAccount = nettTurnoverAccount;
    }

    public Integer getNettTurnoverVatFreeAccount() {
        return nettTurnoverVatFreeAccount;
    }

    public void setNettTurnoverVatFreeAccount(Integer nettTurnoverVatFreeAccount) {
        this.nettTurnoverVatFreeAccount = nettTurnoverVatFreeAccount;
    }

    public Integer getProductPurchaseAccount() {
        return productPurchaseAccount;
    }

    public void setProductPurchaseAccount(Integer productPurchaseAccount) {
        this.productPurchaseAccount = productPurchaseAccount;
    }

    public Integer getProductPurchaseVatFreeAccount() {
        return productPurchaseVatFreeAccount;
    }

    public void setProductPurchaseVatFreeAccount(Integer productPurchaseVatFreeAccount) {
        this.productPurchaseVatFreeAccount = productPurchaseVatFreeAccount;
    }

    public Integer getStockAccount() {
        return stockAccount;
    }

    public void setStockAccount(Integer stockAccount) {
        this.stockAccount = stockAccount;
    }

    public Integer getStockReceptionAccount() {
        return stockReceptionAccount;
    }

    public void setStockReceptionAccount(Integer stockReceptionAccount) {
        this.stockReceptionAccount = stockReceptionAccount;
    }

    public Integer getUnpaidStockAccount() {
        return unpaidStockAccount;
    }

    public void setUnpaidStockAccount(Integer unpaidStockAccount) {
        this.unpaidStockAccount = unpaidStockAccount;
    }

    public boolean isDefaultInventoryManagement() {
        return defaultInventoryManagement;
    }

    public void setDefaultInventoryManagement(boolean defaultInventoryManagement) {
        this.defaultInventoryManagement = defaultInventoryManagement;
    }
    
    
}
