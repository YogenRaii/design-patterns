package com.eprogrammerz.examples.gof.patterns.chainofresponsibility.ordermgmtv2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${YogenRai} on 4/24/2016.
 */
public class MostFavoredCustomerOrderHandler extends OrderReceiver {

    private List<MostValuedCustomer> customers = new ArrayList<MostValuedCustomer>() {
        {
            add(new MostValuedCustomer("Yogen"));
            add(new MostValuedCustomer("Rita"));
        }
    };

    @Override
    public void handleOrder(Order request) {
        Customer orderingCustomer = request.getCustomer();
        for (MostValuedCustomer customer : customers) {
            if (customer.getName().equals(orderingCustomer.getName())) {
                System.out.println("Most Valued Customer Chance.");
                return;
            }
        }
        if (successor != null) {
            successor.handleOrder(request);
        }
    }
}
