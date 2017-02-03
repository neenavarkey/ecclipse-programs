package com.CoffeeShop.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.CoffeeShop.dao.ProductDao;

import com.CoffeeShop.model.Product;

@service

public class ProductServiceImpl implements ProductService{
@Autowired
	private ProductDao  productDao;
	
	public ProductServiceImpl(){
		
		System.out.println("CREATING INSTANCE FOR PRODUCTSERVICEIMPL");
	}
	public Product saveProduct(Product product) {
		
		
		return productDao.saveProduct(product);
	}

}
