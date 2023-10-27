package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {

    @Test
    public void canWithdrawMoney(){
        double initialBalance = 400;
        double amount = 200;
        double actualFinalBalance;
        double expectedFinalBalance = 200;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", initialBalance, 0);
        account1.withdraw(amount);
        actualFinalBalance = account1.getBalance();
        assertEquals(expectedFinalBalance, actualFinalBalance);
    }

    @Test
    public void balanceCantGoBelowZeroTest(){
        double initialBalance = 50;
        double finalBalance;
        double amount = 60;
        SavingsAccount account1 = new SavingsAccount("Tall Archie", 400, 0);
        account1.setBalance(initialBalance);
        account1.withdraw(amount);
        finalBalance = account1.getBalance();
        assertEquals(finalBalance, initialBalance);
    }
}
