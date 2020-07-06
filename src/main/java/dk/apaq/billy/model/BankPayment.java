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

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public float getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(float cashAmount) {
        this.cashAmount = cashAmount;
    }

    public CashSide getCashSide() {
        return cashSide;
    }

    public void setCashSide(CashSide cashSide) {
        this.cashSide = cashSide;
    }

    public String getCashAccountId() {
        return cashAccountId;
    }

    public void setCashAccountId(String cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public float getCashExchangeRate() {
        return cashExchangeRate;
    }

    public void setCashExchangeRate(float cashExchangeRate) {
        this.cashExchangeRate = cashExchangeRate;
    }

    public String getSubjectCurrencyId() {
        return subjectCurrencyId;
    }

    public void setSubjectCurrencyId(String subjectCurrencyId) {
        this.subjectCurrencyId = subjectCurrencyId;
    }

    public float getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(float feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeAccountId() {
        return feeAccountId;
    }

    public void setFeeAccountId(String feeAccountId) {
        this.feeAccountId = feeAccountId;
    }

    public boolean isVoided() {
        return voided;
    }

    public void setVoided(boolean voided) {
        this.voided = voided;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    public void setAssociation(List<Association> associations) {
        this.associations = associations;
    }
}
