package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${YogenRai} on 3/26/2016.
 *
 * AbstractMarket is Subject
 */
public abstract class AbstractMarket {
    Map<String,Double> stockList = new HashMap<String,Double>();
    public Map<String, Double> getStockList() {
        return stockList;
    }
}