package com.previsto.billy.mapping;

import com.previsto.billy.model.BankPayment;

public class SingularBankPaymentMapping extends BankPaymentMapping implements SingularMapping<BankPayment> {
    private BankPayment bankPayment;

    public BankPayment getBankPayment() {
        return bankPayment;
    }

    public void setBankPayment(BankPayment contact) {
        this.bankPayment = contact;
    }

    @Override
    public BankPayment getEntity() {
        resolveExtraData(bankPayment);
        return bankPayment;
    }

}
