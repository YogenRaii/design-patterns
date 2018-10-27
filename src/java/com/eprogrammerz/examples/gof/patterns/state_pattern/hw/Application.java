package com.eprogrammerz.examples.gof.patterns.state_pattern.hw;

/**
 * Created by ${YogenRai} on 4/23/2016.
 */
public class Application {
    public static void main(String[] args) {
        FFAccount ffaccount = new FFAccount("213425");
        ffaccount.addFlight(13000);
        System.out.println("Accountnr ="+ffaccount.getAccountNumber());
        System.out.println("Account type ="+ffaccount.getAccountState());
        System.out.println("miles ="+ffaccount.getNumberOfMiles());

        ffaccount.addFlight(99000);
        System.out.println("Accountnr ="+ffaccount.getAccountNumber());
        System.out.println("Account type ="+ffaccount.getAccountState());
        System.out.println("miles ="+ffaccount.getNumberOfMiles());
    }
}
