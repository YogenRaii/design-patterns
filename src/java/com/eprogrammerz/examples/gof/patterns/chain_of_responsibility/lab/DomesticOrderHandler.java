package com.eprogrammerz.examples.gof.patterns.chain_of_responsibility.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class DomesticOrderHandler extends OrderReceiver {
    @Override
    public void handleOrder(Order order) {
        if(!order.isInternational()){
            System.out.println("Domestic Order handler.");
        }
    }
}
