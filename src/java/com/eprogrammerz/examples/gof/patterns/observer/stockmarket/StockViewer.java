package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.Iterator;
import java.util.Map;

/**
 * This is a concrete Observer
 */
public class StockViewer implements StockBroker {

    public void update(Map<String, Double> stockList) {
        System.out.println("StockViewer: stockList is changed:");

        Iterator iter = stockList.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer " + key + " - $" + value);
        }
    }
}
