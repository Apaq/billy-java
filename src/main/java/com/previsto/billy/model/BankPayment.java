package com.previsto.billy.model;

import com.previsto.billy.model.enums.CashSide;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankPayment extends Entity  {
    private String contactId;
    private LocalDate entryDate;
    private float cashAmount;
    private CashSide cashSide;
    private String cashAccountId;
    private float cashExchangeRate;
    private String subjectCurrencyId;
    private float feeAmount;
    private String feeAccountId;
    private boolean isVoided;
    private List<Association> association = new ArrayList<>();

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
        return isVoided;
    }

    public void setVoided(boolean voided) {
        isVoided = voided;
    }

    public List<Association> getAssociation() {
        return association;
    }

    public void setAssociation(List<Association> association) {
        this.association = association;
    }
}
