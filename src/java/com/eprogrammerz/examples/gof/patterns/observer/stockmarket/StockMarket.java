package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.HashMap;
import java.util.Map;

/**
 * It is concrete Subject
 */
public class StockMarket extends AbstractStockMarket {

    private Map<String, Double> stockList = new HashMap<>();

    public void addStock(String stockSymbol, Double price) {
        stockList.put(stockSymbol, price);
    }

    public void update(String stockSymbol, Double price) {
        stockList.put(stockSymbol, price);
        notifyStockBroker(stockList);
    }
}