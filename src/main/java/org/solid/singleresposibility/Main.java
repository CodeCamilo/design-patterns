package org.solid.singleresposibility;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        AccountOperations accountOperations = new AccountOperations();

        accountOperations.addAccount(new Account("Manolo",1347));
        accountOperations.addAccount(new Account("Juan Jose",456789));

        System.out.println(accountOperations.getAccount(1));

        TransactionOperation trOp = new TransactionOperation();
        double price = 100;

        System.out.println("After adding money");
        trOp.deposit( price, 1);

        System.out.println(accountOperations.getAccount(1));

        trOp.withdraw(90, 2);
        trOp.withdraw(99, 1);
        System.out.println("After withdraw");
        System.out.println(accountOperations.getAccount(2));
        System.out.println(accountOperations.getAccount(1));

    }
}
