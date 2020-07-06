package dk.apaq.billy.mapping;

import dk.apaq.billy.model.BankPayment;

public class PersistBankPaymentMapping implements PersistMapping<BankPayment> {
    private BankPayment bankPayment;

    public BankPayment getBankPayment() {
        return bankPayment;
    }

    public void setBankPayment(BankPayment bankPayment) {
        this.bankPayment = bankPayment;
    }

    @Override
    public void setEntity(BankPayment entity) {
        this.bankPayment = entity;
    }
    
    
}
