package com.eprogrammerz.examples.gof.patterns.strategy_pattern.strategy_pattern_lab.domain;

/**
 * Created by ${YogenRai} on 4/2/2016.
 */
public class CheckingAccount implements AccountType {
    @Override
    public double calculateInterest(double balance) {
        return (balance < 1000)? balance * 0.015 : balance * 0.025;
    }

    @Override
    public String toString(){
        return "Checking";
    }
}
