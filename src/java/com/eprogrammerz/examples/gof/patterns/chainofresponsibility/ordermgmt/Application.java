package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmt;

/**
 * Client
 */
public class Application {
    public static void main(String[] args) {
        OrderReceiver largeOrder = new LargeOrderHandler();
        OrderReceiver international = new InternationalOrderHandler();
        OrderReceiver domestic = new DomesticOrderHandler();

        largeOrder.setSuccessor(international);
        international.setSuccessor(domestic);

        Customer customer1 = new Customer("Yogen");
        Customer customer2 = new Customer("Robert");

        Order order1 = new Order(1001, 12300, false, customer1);
        Order order2 = new Order(1002, 1300, true, customer2);

        largeOrder.handleOrder(order1);
        largeOrder.handleOrder(order2);
    }
}
