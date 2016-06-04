package com.eShop.service;

import com.eShop.repository.IProductRepository;

/**
 * Created by rajkumar on 6/3/2016.
 */
public class InventoryService implements IInventoryService {
    IProductRepository productRepository;

    public void setProductRepository(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public int getNumberInStock(int productNumber) {
//        return productRepository.getNumberInStock(productNumber);
        return 0;
    }
}
