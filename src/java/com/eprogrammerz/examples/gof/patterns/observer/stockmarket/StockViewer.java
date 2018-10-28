package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.Map;

/**
 * This is a concrete Observer
 */
public class StockViewer implements StockBroker {

    public void update(Map<String, Double> stocks) {
        System.out.println("StockViewer: stockList is changed:");
        stocks.forEach((symbol, value) -> System.out.println(symbol + " - $" + value));
    }
}
