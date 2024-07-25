package org.solid.singleresposibility;

public class Account {
    private int accountNumber;
    private String firstName;
    private double totalAmount;
    private static Integer count = 0;


    public Account(String firstName, double totalAmount) {
        count++;
        this.accountNumber += count;
        this.firstName = firstName;
        this.totalAmount = totalAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", firstName='" + firstName + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }




}
