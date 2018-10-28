package com.eprogrammerz.examples.gof.patterns.observer.stockmarket;

/**
 * It is concrete Subject
 */
public class StockMarket extends Market {

    public void addStock(String stockSymbol, Double price) {
        stockList.put(stockSymbol, price);
    }

    public void update(String stockSymbol, Double price) {
        stockList.put(stockSymbol, price);
        notifyStockBroker(stockList);
    }
}