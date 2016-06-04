package com.eShop.service;

import com.eShop.domain.Product;
import com.eShop.repository.IProductRepository;

import java.util.*;

public class ProductService implements IProductService{
	private IProductRepository productRepository;

	public ProductService(){}

	public void setProductRepository(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public Product getProduct(int productNumber) {
		return productRepository.findOne(productNumber);
	}

//	private IInventoryService inventoryService;
//
//	public void setInventoryService(IInventoryService inventoryService) {
//		this.inventoryService = inventoryService;
//	}
//
//	@Override
//	public int getNumberInStock(int productNumber) {
//		return inventoryService.getNumberInStock(productNumber);
//	}

}

