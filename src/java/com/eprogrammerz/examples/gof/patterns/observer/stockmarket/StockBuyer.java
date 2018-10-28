package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.Map;

/**
 * Here, StockBuyer is a concrete Observer
 */
public class StockBuyer implements StockBroker {

    public void update(Map<String, Double> stocks) {
        System.out.println("StockBuyer: stockList is changed:");
        stocks.forEach((symbol, value) -> System.out.println(symbol + " - $" + value));
    }
}
