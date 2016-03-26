package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${YogenRai} on 3/26/2016.
 *
 * It is concrete Subject
 */
public class StockMarket extends AbstractMarket{

    private List<StockBroker> stockBrokers= new ArrayList<StockBroker>();

    public void addStockBroker(StockBroker stockBroker){
        stockBrokers.add(stockBroker);
    }

    public void addStock(String stockSymbol, Double price){
        stockList.put(stockSymbol, price);
    }
    public void update(String stockSymbol, Double price){
        stockList.put(stockSymbol, price);
        notifyStockBroker();
    }

    public void notifyStockBroker(){
        for(StockBroker broker:stockBrokers){
            broker.update(stockList);
        }
    }
}