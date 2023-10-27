package com.qa;

public abstract class BankAccount {

    private double balance = 0;
    private double minimumBalance = 0;
    private String accountHolderName = "";

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double moneyIn) {
        this.setBalance(this.getBalance() + moneyIn);
    }

    public void withdraw(double moneyOut) {
        this.setBalance(this.getBalance() - moneyOut);
    }

}
