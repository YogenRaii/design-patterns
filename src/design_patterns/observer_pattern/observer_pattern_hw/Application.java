package design_patterns.observer_pattern.observer_pattern_hw;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class Application {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        StockBroker buyer= new StockBuyer();
        StockBroker viewer = new StockViewer();

        market.addStockBroker(buyer);
        market.addStockBroker(viewer);

        market.addStock("ORC", 12.23);
        market.addStock("MSC", 45.78);
        market.update("ORC", 12.34);
        market.update("MSC", 44.68);
    }
}
