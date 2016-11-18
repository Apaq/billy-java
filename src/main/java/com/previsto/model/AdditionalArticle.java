package com.previsto.model;

public class AdditionalArticle {

    private Long articleId;
    private double quantity;
    private String articleNumber;
    private String additionalArticleId;
    private String articleDescription;
    private Long id;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getAdditionalArticleId() {
        return additionalArticleId;
    }

    public void setAdditionalArticleId(String additionalArticleId) {
        this.additionalArticleId = additionalArticleId;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
