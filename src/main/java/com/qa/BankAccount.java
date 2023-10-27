package com.qa;

public abstract class BankAccount {
    public BankAccount() {
        this("Unknown", 0);
    };
    public BankAccount(String accountHolderName, double balance) {
        this(accountHolderName, balance, 0);
    }

    public BankAccount(String accountHolderName, double balance, double minimumBalance) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.minimumBalance = minimumBalance;
    }
    private double balance = 0;

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    private double minimumBalance = 0;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    private String accountHolderName = "";



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double moneyIn) {
        if (moneyIn > 0) {
            this.setBalance(this.getBalance() + moneyIn);
        }

        else {
            System.out.println("You cannot deposit a negative amount");
        }
    }

    public void withdraw(double moneyOut){
        if(!isTwoDecimalPlaces(moneyOut) || moneyOut <= 0) { //validity checks
            System.out.println("Invalid operation");
            return;
        }
        if (moneyOut <= this.getBalance())
            this.setBalance(this.getBalance()-moneyOut);
        else System.out.println("Sorry that you're poor.");
    }


    public boolean isTwoDecimalPlaces(Double input){
        String[] splitter = input.toString().split("\\.");
        int decimalLength = splitter[1].length();  // After Decimal Count
        return decimalLength <= 2;
    }
}
