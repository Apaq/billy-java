package dk.apaq.billy.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dk.apaq.billy.model.enums.CashSide;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankPayment extends Entity  {
    private String contactId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate entryDate;
    private float cashAmount;
    private CashSide cashSide = CashSide.Debit;
    private String cashAccountId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private float cashExchangeRate = 1;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String subjectCurrencyId;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private float feeAmount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String feeAccountId;
    @JsonProperty("isVoided")
    private boolean voided = false;
    private List<Association> associations = new ArrayList<>();

    public String getContactId() {
        return contactId;
    }

    /**
     * The contact that all of the associations' subjects belong to. You can omit setting this property if you supply
     * one or more records in associations. It will then default to the contact of the associations' subject.
     * @param contactId The id of the contact.
     */
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    /**
     * The date of the transaction.
     * @param entryDate
     */
    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public float getCashAmount() {
        return cashAmount;
    }

    /**
     * The amount that was deposited into or withdrawn from cashAccount in the account's currency.
     * @param cashAmount
     */
    public void setCashAmount(float cashAmount) {
        this.cashAmount = cashAmount;
    }

    public CashSide getCashSide() {
        return cashSide;
    }

    /**
     * Indicates whether the payment was a deposit (debit) or a withdrawal (credit).
     * @param cashSide
     */
    public void setCashSide(CashSide cashSide) {
        this.cashSide = cashSide;
    }

    public String getCashAccountId() {
        return cashAccountId;
    }

    /**
     * The account that an amount was deposited into or withdrawn from. Must have isPaymentEnabled set to true.
     * @param cashAccountId
     */
    public void setCashAccountId(String cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public float getCashExchangeRate() {
        return cashExchangeRate;
    }

    /**
     * The exchange rate between subjectCurrency and cashAccount's currency. 1 subjectCurrency = cashExchangeRate
     * cashAccountCurrency. Must be set if cashAccount's currency is different than subjectCurrency. Will be ignored
     * and set to 1 if the currencies are the same.
     * @param cashExchangeRate
     */
    public void setCashExchangeRate(float cashExchangeRate) {
        this.cashExchangeRate = cashExchangeRate;
    }

    public String getSubjectCurrencyId() {
        return subjectCurrencyId;
    }

    /**
     * The currency of what was paid. You can omit setting this property if you supply one or more records in
     * associations. It will then default to the currency of the associations' subject. In case of an overpayment,
     * the overpaid amount will be added to the contact's balance in this currency.
     * @param subjectCurrencyId
     */
    public void setSubjectCurrencyId(String subjectCurrencyId) {
        this.subjectCurrencyId = subjectCurrencyId;
    }

    public float getFeeAmount() {
        return feeAmount;
    }

    /**
     * 	Used if the bank or payment provider charged the organization a fee for handling this payment. The fee amount
     * 	must be positive, and will always be recorded as an expense (i.e., a debit posting on an expense account).
     * 	feeAmount is in the same currency as cashAccount's currency. The fee is always considered the organization's
     * 	expense. This means that:
     *
     * <ul>
     *   <li>For deposits the subjects' balances will also be offset against the fee, as the
     *      customer shouldn't pay for the organization's payment expenses. Example: An invoice of 100 USD will be paid in
     *      full by a cashAmount of 95 and a feeAmount of 5.</li>
     *   <li>For withdrawals the subject's balances will not be offset
     *      against the fee, as the supplier shouldn't pay for the organization's payment expenses. Example: A bill of 100
     *      USD will be paid in full by a cashAmount of 105 and a feeAmount of 5.</li>
     *
     * @param feeAmount
     */
    public void setFeeAmount(float feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeAccountId() {
        return feeAccountId;
    }

    /**
     * The account to record the fee expense on. Must be an expense account. Must be set if feeAmount is set.
     * @param feeAccountId
     */
    public void setFeeAccountId(String feeAccountId) {
        this.feeAccountId = feeAccountId;
    }

    public boolean isVoided() {
        return voided;
    }

    /**
     * Indicates if the payment has been canceled. You must leave this field blank or set to false for new payments.
     * Once a payment has been canceled by setting this field to true it can't be reinstated ("un-canceled").
     * @param voided
     */
    public void setVoided(boolean voided) {
        this.voided = voided;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    /**
     * The subjects this payment involves. The subjects' outstanding balance and isPaid properties will automatically
     * be updated by the API.
     * @param associations
     */
    public void setAssociation(List<Association> associations) {
        this.associations = associations;
    }
}
