package com.qa;

public class App 
{
    public static void main( String[] args ) {
        CurrentAccount account = new CurrentAccount("Test account", 100, -500);
        System.out.println(account);
    }
}
