package com.qa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTest {

    CurrentAccount account = new CurrentAccount();
//    @BeforeAll
//    public static void init() {
//
//    }
    @Test
    @DisplayName("Depositing 100 adds 100 to the balance")
    public void depositing_1_adds_1_to_the_balance() {
        account.setBalance(100);
        account.deposit(100);
        assertEquals(200, account.getBalance());
    }

    @Test
    @DisplayName("Depositing 100.50 adds 100.50 to the balance")
    public void depositing_decimal_adds_to_the_balance_correctly() {
        account.setBalance(100);
        account.deposit(100.50);
        assertEquals(200.50, account.getBalance());
    }

    @Test
    @DisplayName("Depositing a negative number doesn't change the balance")
    public void depositing_negative_does_not_change_balance() {
        account.setBalance(100);
        account.deposit(-100);
        assertEquals(100, account.getBalance());
    }

}
