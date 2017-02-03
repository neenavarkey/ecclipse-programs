package com.CoffeeShop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.CoffeeShop.model.Product;
@Repositary

public class ProductDaoImpl implements ProductDao {
	
@Autowired

private SessionFactory sessionFactory;
	public ProductDaoImpl(){
		System.out.println("CREATING INSTANCE FOR PRODUCTDAOIMPL");
	}
	public Product saveProduct(Product product){
		System.out.println(product.getId());
		Session session=sessionFactory.openSession();
		session.save(product);
		session.flush();
		session.close();
		System.out.println(product.getId());
		return product;
	}

}
