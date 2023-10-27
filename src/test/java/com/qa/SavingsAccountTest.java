package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    @Test
    public void canWithdrawMoney() {
        double initialBalance = 400;
        double amount = 200;
        double actualFinalBalance;
        double expectedFinalBalance = 200;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        account1.withdraw(amount);
        actualFinalBalance = account1.getBalance();
        assertEquals(expectedFinalBalance, actualFinalBalance);
    }

    @Test
    public void balanceCantGoBelowZeroTest() {
        double initialBalance = 50;
        double finalBalance;
        double amount = 60;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        account1.withdraw(amount);
        finalBalance = account1.getBalance();
        assertEquals(finalBalance, initialBalance);
    }

    @Test
    public void withdrawInputIsGreaterThanZero() {
        double initialBalance = 50;
        double finalBalance;
        double amount = -1;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        account1.withdraw(amount);
        finalBalance = account1.getBalance();
        assertEquals(finalBalance, initialBalance); //unchanged as not possible
    }

    @Test
    public void cannotWithdrawMoreThan2DecimalPlaces() {
        double initialBalance = 50;
        double finalBalance;
        double amount = 1.2345;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        account1.withdraw(amount);
        finalBalance = account1.getBalance();
        assertEquals(finalBalance, initialBalance); //unchanged as not possible
    }

    @Test
    public void noMoreThan2DecimalPlaces() {
        double initialBalance = 0.123;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        boolean actualValue = account1.isTwoDecimalPlaces(initialBalance);
        boolean expected = false;
        assertEquals(expected, actualValue);
    }

    @Test
    public void detectsThan2DecimalPlaces() {
        double initialBalance = 0.12;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        boolean actualValue = account1.isTwoDecimalPlaces(initialBalance);
        boolean expected = true;
        assertEquals(expected, actualValue);
    }

    @Test
    public void detectsLessThan2DecimalPlaces() {
        double initialBalance = 0.1;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        boolean actualValue = account1.isTwoDecimalPlaces(initialBalance);
        boolean expected = true;
        assertEquals(expected, actualValue);
    }
    @Test
    public void worksWithWholeNumber(){
        double initialBalance = 1;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance);
        boolean actualValue = account1.isTwoDecimalPlaces(initialBalance);
        boolean expected = true;
        assertEquals(expected, actualValue);
    }
    
}
