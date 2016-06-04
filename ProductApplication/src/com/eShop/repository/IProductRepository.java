package com.eShop.repository;

import com.eShop.domain.Product;

import java.util.List;

/**
 * Created by rajkumar on 6/3/2016.
 */
public interface IProductRepository {
    Product findOne(int productNumber);
//    int getNumberInStock(int productNumber);
}
