package com.eprogrammerz.examples.gof.patterns.chain_of_responsibility.example;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class InternationalOrderHandler extends OrderReceiver {
    @Override
    public void handleOrder(Order order) {
        if(order.isInternational()){
            System.out.println("International Order");
        }else if(successor != null){
            successor.handleOrder(order);
        }
    }
}
