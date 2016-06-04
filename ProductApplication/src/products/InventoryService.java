package products;

/**
 * Created by rajkumar on 6/3/2016.
 */
public class InventoryService implements IInventoryService {
    @Override
    public int getNumberInStock(int productNumber) {
        return productNumber - 200;
    }
}
