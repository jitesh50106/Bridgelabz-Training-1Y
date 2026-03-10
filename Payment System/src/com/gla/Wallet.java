package com.gla;

public class Wallet implements Payment {

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}
