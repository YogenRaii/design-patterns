package com.eprogrammerz.examples.gof.patterns.strategy.bankapp.domain;

/**
 * Created by ${YogenRai} on 4/2/2016.
 *
 * Concrete implementation of strategy AccountType
 */
public class CheckingAccount implements AccountType {
    @Override
    public double calculateInterest(double balance) {
        return (balance < 1000) ? balance * 0.015 : balance * 0.025;
    }

    @Override
    public String toString() {
        return "Checking";
    }
}
