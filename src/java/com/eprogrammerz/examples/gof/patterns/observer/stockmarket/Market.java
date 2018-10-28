package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.HashMap;
import java.util.Map;

/**
 * Subject
 */
public abstract class Market extends Subject {
    protected Map<String, Double> stockList = new HashMap<String, Double>();

    public Map<String, Double> getStockList() {
        return stockList;
    }
}