package com.eprogrammerz.examples.gof.patterns.observer.bankapp;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
