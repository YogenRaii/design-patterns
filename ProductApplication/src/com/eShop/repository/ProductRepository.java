package com.eShop.repository;

import com.eShop.domain.Product;

import java.util.*;

/**
 * Created by rajkumar on 6/3/2016.
 */
public class ProductRepository implements IProductRepository {

    private Collection<Product> productList;

    private Map<Integer,Integer> productCounts ;

    public ProductRepository(){
        productList = new ArrayList(){
            {
                add(new Product(234,"LCD TV", 895.50));
                add(new Product(239,"DVD player", 315.00));
                add(new Product(423,"Plasma TV", 992.55));
            }
        };

        productCounts = new HashMap(){
            {
                put(234,112);
                put(239,445);
                put(423,221);
            }
        };
    }


    @Override
    public Product findOne(int productNumber) {
        for (Product product : productList) {
            if (product.getProductNumber() == productNumber)
                return product;
        }
        return null;
    }

//    @Override
//    public int getNumberInStock(int productNumber) {
//        return productCounts.get(productNumber);
//    }
}
