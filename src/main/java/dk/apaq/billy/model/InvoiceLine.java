package dk.apaq.billy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dk.apaq.billy.model.enums.DiscountMode;

public class InvoiceLine {

    private String productId;
    private String description;
    private float quantity = 1;
    private float unitPrice;
    private float amount;
    private float tax;
    private String taxRateId;
    private String discountText;
    private DiscountMode discountMode;
    private Float discountValue;
    private int priority;

    public String getProductId() {
        return productId;
    }

    /**
     * The product to use for the line.
     * @param productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Optional description to display under the product's name on the invoice.
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public float getQuantity() {
        return quantity;
    }

    /**
     * The line's quantity. Defaults to 1.
     * @param quantity
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    /**
     * The price per unit of the product.
     * @param unitPrice
     */
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JsonIgnore
    public float getAmount() {
        return amount;
    }

    @JsonProperty
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @JsonIgnore
    public float getTax() {
        return tax;
    }

    @JsonProperty
    public void setTax(float tax) {
        this.tax = tax;
    }

    @JsonIgnore
    public String getTaxRateId() {
        return taxRateId;
    }

    @JsonProperty
    public void setTaxRateId(String taxRateId) {
        this.taxRateId = taxRateId;
    }

    public String getDiscountText() {
        return discountText;
    }

    /**
     * Text to display if the line includes a discount.
     * @param discountText
     */
    public void setDiscountText(String discountText) {
        this.discountText = discountText;
    }

    public DiscountMode getDiscountMode() {
        return discountMode;
    }

    /**
     * How the discount should be calculated. Cash discount: The value of @discountValue@ will be subtracted from the
     * line's amount. Percentage discount: The percentage value of @discountValue@ will be subtracted from the line's
     * amount.
     * @param discountMode
     */
    public void setDiscountMode(DiscountMode discountMode) {
        this.discountMode = discountMode;
    }

    /**
     * Depending on @discountMode@, either an amount or a percentage value. Percentage value should be supplied as e.g.
     * 25 for 25%. Required if @discountValue@ is set. ignored if @discountValue@ is not set.
     * @return
     */
    public Float getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Float discountValue) {
        this.discountValue = discountValue;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    
}
