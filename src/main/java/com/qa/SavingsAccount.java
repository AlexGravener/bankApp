package com.qa;

public class SavingsAccount extends BankAccount{

    public SavingsAccount( String accountHolderName, double balance) {
        super(accountHolderName, balance, 0);
    }

    public double getInterestRate() {
        return interestRate;
    }

    private static final double interestRate = 3;

    @Override
    public String toString() {
        return String.format("\nAccount name: %s\nCurrent balance: £%.2f\nInterest rate: %.2f%%", this.getAccountHolderName(),
                this.getBalance(), this.getInterestRate());
    }

}
