package com.eprogrammerz.examples.gof.patterns.chain_of_responsibility.lab;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class LargeOrderHandler extends OrderReceiver {
    @Override
    public void handleOrder(Order request) {
        if(request.getTotalAmount() > 30000){
            System.out.println("Large order handle");
        }else if(successor != null){
            successor.handleOrder(request);
        }
    }
}
