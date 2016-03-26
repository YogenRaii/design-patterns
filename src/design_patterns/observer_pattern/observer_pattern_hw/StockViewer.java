package design_patterns.observer_pattern.observer_pattern_hw;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by ${YogenRai} on 3/26/2016.
 *
 * This is Observer
 */
public class StockViewer implements StockBroker {

    public void update(Map<String, Double> stocklist) {
        System.out.println("StockViewer: stockList is changed:");

        Iterator iter = stocklist.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println("StockViewer " + key + " - $" + value);
        }
    }
}
