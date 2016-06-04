package products;

public interface IProductService {
    Product getProduct(int productNumber);
    int getNumberInStock(int productNumber);
}
