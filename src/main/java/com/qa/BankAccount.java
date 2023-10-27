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
