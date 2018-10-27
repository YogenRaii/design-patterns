package com.eprogrammerz.examples.gof.patterns.observer_pattern.observer_pattern_hw;

import java.util.Map;
/**
 * Observer interface
 */
interface StockBroker {
    void update(Map<String, Double> stockList);
}
