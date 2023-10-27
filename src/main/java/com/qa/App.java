package com.qa;

import java.util.ArrayList;
import java.util.Random;

public class App
{
    public static void main( String[] args ) {
        CurrentAccount currentAccount = new CurrentAccount("Test account", 100, -500);
        System.out.println(currentAccount);

        currentAccount.deposit(100);
        System.out.println(currentAccount);

        SavingsAccount savingsAccount = new SavingsAccount("Test savings account", 100);
        System.out.println(savingsAccount);

        ArrayList<BankAccount> testAccounts = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            String name = "Test account " + i;

            if (i % 2 == 0) {
                testAccounts.add(new SavingsAccount(name, rand.nextInt(100)));
            }

            else {
                testAccounts.add(new CurrentAccount(name, rand.nextInt(100), rand.nextInt(100) * -1));
            }

            System.out.println(testAccounts.get(i));
            testAccounts.get(i).withdraw(rand.nextInt(100));
            System.out.println(testAccounts.get(i));
            testAccounts.get(i).deposit(rand.nextInt(100));
        }



    }
}
