package org.solid.liskov.bad;

public class LoanCloseruService {
    private LoanPayment loanPayment;

    public LoanCloseruService (LoanPayment loanPayment){
        this.loanPayment = loanPayment;
    }

    public void forceCloseLoan(){
        loanPayment.forceCloseLoan();
    }


}
