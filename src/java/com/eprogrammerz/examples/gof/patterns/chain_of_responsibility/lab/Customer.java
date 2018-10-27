package com.eprogrammerz.examples.gof.patterns.chain_of_responsibility.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
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
}
