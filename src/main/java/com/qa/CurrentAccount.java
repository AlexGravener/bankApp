package com.qa;

public class CurrentAccount extends BankAccount{
    public CurrentAccount() {
        super();
    }

    public CurrentAccount(String accountHolderName, double balance, double minimumBalance) {
        super(accountHolderName, balance);
        this.setMinimumBalance(minimumBalance);
    }

    @Override
    public String toString() {
        return String.format("Account name: %s\nCurrent balance: £%.2f\nOverdraft available: £%.2f\nAvailable balance: £%.2f", this.getAccountHolderName(),
        this.getBalance(), Math.abs(this.getMinimumBalance()), Math.abs(this.getMinimumBalance()) + this.getBalance());
    }
}
