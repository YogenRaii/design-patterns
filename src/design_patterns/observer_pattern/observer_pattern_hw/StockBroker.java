package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.Map;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
interface StockBroker {

    void update(Map<String, Double> stockList);
}
