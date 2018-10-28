package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.Map;

/**
 * Observer interface
 */
interface StockBroker {
    void update(Map<String, Double> stockList);
}
