package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmtv2;

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
