package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.HashMap;
import java.util.Map;

/**
 * Subject
 */
public abstract class Market extends Subject {
    Map<String,Double> stockList = new HashMap<String,Double>();
    public Map<String, Double> getStockList() {
        return stockList;
    }
}