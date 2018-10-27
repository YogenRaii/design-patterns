package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmtv2;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class Application {
    public static void main(String[] args) {
        OrderReceiver mostValued = new MostFavoredCustomerOrderHandler();
        OrderReceiver largeOrder = new LargeOrderHandler();
        OrderReceiver international = new InternationalOrderHandler();
        OrderReceiver domestic = new DomesticOrderHandler();

        mostValued.setSuccessor(largeOrder);
        largeOrder.setSuccessor(international);
        international.setSuccessor(domestic);

        Customer customer1 = new Customer("Yogen");
        Customer customer2 = new Customer("Robert");

        Order order1 = new Order(1001, 12300, false, customer1);
        Order order2 = new Order(1002, 1300, true, customer2);

        mostValued.handleOrder(order1);
        mostValued.handleOrder(order2);
    }
}
