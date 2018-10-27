package com.eprogrammerz.examples.gof.patterns.observer_pattern.observer_pattern_hw;

import java.util.Iterator;
import java.util.Map;

/**
 * Here, StockBuyer is a concrete Observer
 */
public class StockBuyer implements StockBroker {

    public void update(Map<String, Double> stockList) {
        System.out.println("StockBuyer: stockList is changed:");
        Iterator iter = stockList.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println(key + " - $" + value);
        }
    }
}
