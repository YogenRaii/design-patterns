package com.eprogrammerz.examples.gof.patterns.chain_of_responsibility.example;

/**
 * domain
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
