package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Subject
 */
public abstract class AbstractStockMarket {
    private List<StockBroker> stockBrokers = new ArrayList<StockBroker>();

    public void addStockBroker(StockBroker stockBroker) {
        stockBrokers.add(stockBroker);
    }

    public void notifyStockBroker(Map<String, Double> stockList) {
        for (StockBroker broker : stockBrokers) {
            broker.update(stockList);
        }
    }

    public abstract void addStock(String stockSymbol, Double price);

    public abstract void update(String stockSymbol, Double price);
}