package org.solid.liskov.bad;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void forceCloseLoan() {
        throw new UnsupportedOperationException("Fore clouse is not allowed");
    }

    @Override
    public void doRepayment(int amount) {
        throw new UnsupportedOperationException("Repayment is not allowed");

    }
}
