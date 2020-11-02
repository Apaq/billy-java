package dk.apaq.billy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dk.apaq.billy.model.enums.InvoiceSentState;
import dk.apaq.billy.model.enums.InvoiceState;
import dk.apaq.billy.model.enums.InvoiceTaxMode;
import dk.apaq.billy.model.enums.InvoiceType;
import dk.apaq.billy.model.enums.PaymentTermsMode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Invoice extends Entity {
    protected LocalDateTime createdTime;
    
    private float amount;
    protected LocalDateTime approvedTime; 
    private String attContactPersonId;
    private float balance;
    private String contactId;
    private String contactMessage;
    private String creditedInvoiceId;
    private String currencyId;
    private String downloadUrl;
    private LocalDate dueDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate entryDate = LocalDate.now();
    private float exchangeRate = 1f;
    private String invoiceNo;
    private boolean paid;
    private String lineDescription;
    private String orderNo;
    private Integer paymentTermsDays;
    private PaymentTermsMode paymentTermsMode;
    private String recurringInvoiceId;
    private InvoiceSentState sentState = InvoiceSentState.Unsent;
    private InvoiceState state = InvoiceState.Draft;
    private float tax;
    private InvoiceTaxMode taxMode = InvoiceTaxMode.Excluding;
    
    private List<InvoiceLine> lines = new ArrayList<>();
    private List<InvoiceAttachment> attachments = new ArrayList<>();
    private List<InvoiceLateFee> lateFees = new ArrayList<>();
    private List<BalanceModifier> balanceModifiers = new ArrayList<>();
    private InvoiceType type = InvoiceType.Invoice;

    
    @JsonIgnore
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    @JsonProperty
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }
    
    @JsonIgnore
    public float getAmount() {
        return amount;
    }

    @JsonProperty
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @JsonIgnore
    public LocalDateTime getApprovedTime() {
        return approvedTime;
    }

    @JsonProperty
    public void setApprovedTime(LocalDateTime approvedTime) {
        this.approvedTime = approvedTime;
    }


    /**
     * Retrieves the ID for a contact person belonging to the contact that should be included as Att: in the invoice
     * address area.
     * @return contact Id
     */
    public String getAttContactPersonId() {
        return attContactPersonId;
    }

    /**
     * Sets the ID for a contact person belonging to the contact that should be included as Att: in the invoice address area.
     * @param attContactPersonId Id of the att contact.
     */
    public void setAttContactPersonId(String attContactPersonId) {
        this.attContactPersonId = attContactPersonId;
    }

    @JsonIgnore
    public float getBalance() {
        return balance;
    }

    @JsonProperty
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * Retrieves the ID of the contact to create the invoice for. This property is required.
     * @return
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the ID of the contact to create the invoice for. This property is required.
     * @param contactId Id of the contact.
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * Retrieves optional message to the contact, to be displayed at the top of the invoice PDF.
     * @return
     */
    public String getContactMessage() {
        return contactMessage;
    }

    /**
     * Sets optional message to the contact, to be displayed at the top of the invoice PDF.
     * @param contactMessage
     */
    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getCreditedInvoiceId() {
        return creditedInvoiceId;
    }

    public void setCreditedInvoiceId(String creditedInvoiceId) {
        this.creditedInvoiceId = creditedInvoiceId;
    }

    /**
     * Retrieves the currency of the invoice, fx. 'DKK'. All lines unitPrice properties should be in this currency.
     * @return
     */
    public String getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the currency of the invoice, fx. 'DKK'. All lines unitPrice properties should be in this currency.
     * @param currencyId
     */
    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * Gets the due date for payment of the invoice. This property is readonly.
     * @return dueDate
     */
    @JsonIgnore
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Set the due date for payment of the invoice. This property is readonly.
     * @param dueDate
     */
    @JsonProperty
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Gets the invoice entry date.
     * @return  The entry date.
     */
    public LocalDate getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the invoice date. This parameter must not be set if the invoice has already been created. This
     * property is required.
     * @param entryDate The entry date.
     */
    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * Gets the exchange rate used for invoices in foreign currencies. See {@link #setExchangeRate(float)}.
     * @return
     */
    public float getExchangeRate() {
        return exchangeRate;
    }

    /**
     * The exchange rate used for invoices in foreign currencies. The value should calculated like this:
     * bq. @exchangeRate@ = @currency@ / @organization's base currency@
     *
     * If this field is left blank, then today's exchange rate will automatically be used. If @currencyId@ equals the
     * organization's base currency, the value of this field is ignored - it will always be 1.
     * @param exchangeRate
     */
    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * Get the invoice number. See {@link #setInvoiceNo(String)}.
     * @return
     */
    @JsonIgnore
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * 	Manually set the invoice number. Invoice numbers has to be unique. If no invoice number is set when the
     * 	invoice is created, it will automatically be assigned a number using the company's invoice number model.
     * 	This parameter must not be set if the invoice has already been created.
     * @param invoiceNo
     */
    @JsonProperty
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @JsonIgnore
    public boolean isPaid() {
        return paid;
    }

    @JsonProperty("isPaid")
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String lineDescription) {
        this.lineDescription = lineDescription;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * Get number of days (positive or negative) for the mode defined by paymentTermsMode
     * @return
     */
    public Integer getPaymentTermsDays() {
        return paymentTermsDays;
    }

    /**
     * Number of days (positive or negative) for the mode defined by paymentTermsMode
     * @param paymentTermsDays
     */
    public void setPaymentTermsDays(Integer paymentTermsDays) {
        this.paymentTermsDays = paymentTermsDays;
    }

    public PaymentTermsMode getPaymentTermsMode() {
        return paymentTermsMode;
    }

    public void setPaymentTermsMode(PaymentTermsMode paymentTermsMode) {
        this.paymentTermsMode = paymentTermsMode;
    }

    @JsonIgnore
    public String getRecurringInvoiceId() {
        return recurringInvoiceId;
    }

    @JsonProperty
    public void setRecurringInvoiceId(String recurringInvoiceId) {
        this.recurringInvoiceId = recurringInvoiceId;
    }

    /**
     * Get the sent state of the email. See {@link #setSentState(InvoiceSentState)}.
     * @return
     */
    public InvoiceSentState getSentState() {
        return sentState;
    }

    /**
     * Sent state of the email. Invoice is marked as Unsent by default, can be marked as Printed, Sent, Opened, Viewed.
     * @param sentState
     */
    public void setSentState(InvoiceSentState sentState) {
        this.sentState = sentState;
    }

    @JsonIgnore
    public InvoiceState getState() {
        return state;
    }

    /**
     * Used to change the state of the invoice. Currently the only state change possible is from draft to approved.
     * Once an invoice has been approved, its state can't be changed. This property is required. Defaults to Draft.
     * @param state
     */
    @JsonProperty
    public void setState(InvoiceState state) {
        this.state = state;
    }

    @JsonIgnore
    public float getTax() {
        return tax;
    }

    @JsonProperty
    public void setTax(float tax) {
        this.tax = tax;
    }

    public InvoiceTaxMode getTaxMode() {
        return taxMode;
    }

    public void setTaxMode(InvoiceTaxMode taxMode) {
        this.taxMode = taxMode;
    }

    /**
     * Sets lines for the invoice. See {@link #setLines(List)}.
     * @return
     */
    public List<InvoiceLine> getLines() {
        return lines;
    }

    /**
     * Lines for the invoice. At minimum, one line must be supplied. If this parameter is set, any existing lines for
     * this invoice will be deleted before adding the new ones. This parameter must not be set if the invoice has
     * already been created.
     * @param lines
     */
    public void setLines(List<InvoiceLine> lines) {
        this.lines = lines;
    }

    
    public List<InvoiceAttachment> getAttachments() {
        return attachments;
    }

    /**
     * Attachments for the invoice.
     * @param attachments
     */
    public void setAttachments(List<InvoiceAttachment> attachments) {
        this.attachments = attachments;
    }

    @JsonIgnore
    public List<InvoiceLateFee> getLateFees() {
        return lateFees;
    }

    public void setLateFees(List<InvoiceLateFee> lateFees) {
        this.lateFees = lateFees;
    }

    @JsonIgnore
    public List<BalanceModifier> getBalanceModifiers() {
        return balanceModifiers;
    }

    /**
     * Payment associations for the invoice.
     * @param balanceModifiers
     */
    @JsonProperty
    public void setBalanceModifiers(List<BalanceModifier> balanceModifiers) {
        this.balanceModifiers = balanceModifiers;
    }

    public InvoiceType getType() {
        return type;
    }

    /**
     * Whether to create an invoice or a credit note. Defaults to @invoice@. This property is immutable.
     * @param type The type of invoice.
     */
    public void setType(InvoiceType type) {
        this.type = type;
    }
    
    
    
}
