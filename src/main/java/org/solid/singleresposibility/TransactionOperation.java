package org.solid.singleresposibility;

public class TransactionOperation {
/*   This is not a good example of single responsibility because i'm using the deposit to get information that should be only on accountOperation
    public void deposit(Double amount, Account acc){
        double sum = amount + acc.getTotalAmount();
        acc.setTotalAmount(sum);
}*/


    public void deposit (double amount, Integer accountNumber){
        //Getting account details is a job of account operations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount() + amount);
    }

    public void withdraw(double amount, Integer accounNumber){
        AccountOperations accountOperations = new AccountOperations();

        Account account = accountOperations.getAccount(accounNumber);
        account.setTotalAmount(account.getTotalAmount() - amount);
    }

}
