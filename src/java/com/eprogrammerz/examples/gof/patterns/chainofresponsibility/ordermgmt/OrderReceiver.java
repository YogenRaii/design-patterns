package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmt;

/**
 * Handler
 */
public abstract class OrderReceiver {
    protected OrderReceiver successor;
    protected Order order;

    public void setSuccessor(OrderReceiver successor) {
        this.successor = successor;
    }

    abstract public void handleOrder(Order request);
}
