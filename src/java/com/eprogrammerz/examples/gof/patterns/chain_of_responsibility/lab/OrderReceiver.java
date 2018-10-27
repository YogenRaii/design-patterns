package com.eprogrammerz.examples.gof.patterns.chain_of_responsibility.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public abstract class OrderReceiver {
    protected OrderReceiver successor;
    protected Order order;

    public void setSuccessor(OrderReceiver successor) {
        this.successor = successor;
    }

    abstract public void handleOrder(Order request);
}
