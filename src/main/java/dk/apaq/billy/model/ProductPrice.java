package dk.apaq.billy.model;

public class ProductPrice {

    private String currencyId;
    private float unitPrice;

    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Currency for the unit price.
     * @param currencyId
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    /**
     * The default unit price for invoice lines when the invoice's currency matches this currency.
     * @param unitPrice
     */
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    
}
