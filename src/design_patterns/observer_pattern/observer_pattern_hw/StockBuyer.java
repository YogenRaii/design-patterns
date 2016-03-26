package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by ${YogenRai} on 3/26/2016.
 *
 * Here, StockBuyer is Observer
 */
public class StockBuyer implements StockBroker {

    public void update(Map<String, Double> stocklist) {
        System.out.println("StockBuyer: stockList is changed:");
        Iterator iter = stocklist.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println(key + " - $" + value);
        }
    }
}
