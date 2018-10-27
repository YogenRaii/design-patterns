package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmtv2;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class DomesticOrderHandler extends OrderReceiver {
    @Override
    public void handleOrder(Order order) {
        if (!order.isInternational()) {
            System.out.println("Domestic Order handler.");
        }
    }
}
