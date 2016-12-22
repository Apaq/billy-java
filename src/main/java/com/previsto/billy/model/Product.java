package com.previsto.billy.model;

public class Product extends Entity {
    private String name;
    private String description;
    private String account;
    private String productNo;
    private String suppliersProductNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getSuppliersProductNo() {
        return suppliersProductNo;
    }

    public void setSuppliersProductNo(String suppliersProductNo) {
        this.suppliersProductNo = suppliersProductNo;
    }
    
    
}
