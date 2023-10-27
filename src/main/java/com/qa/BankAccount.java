package com.qa;

public abstract class BankAccount {

    public BankAccount( String accountHolderName, double balance, double minimumBalance) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance = 0;
    private double minimumBalance = 0;
    private String accountHolderName = "";

    public void  deposit(double moneyIn){
        this.setBalance(this.getBalance()+moneyIn);
    }

    public void withdraw(double moneyOut){
        if (moneyOut <= this.getBalance())
            this.setBalance(this.getBalance()-moneyOut);
        else System.out.println("Sorry that you're poor.");
    }

}
