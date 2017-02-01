package com.niit.model;

import java.util.Date;
@Entity
@Table(name="product")
//Table Name=product
//primary key=id
//name-varchar(255),description-varchar,price-number,quantity-number,mfg-date
public class Product {
	@id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@column(name="pid")
	private int id;
	@column(name="productname")
	private String name;
	private String description;
	private double price;
	private int quantity;
	private Date mfg;
//sample_product[pid,name,description,quantity,price,mfg]

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getMfg() {
		return mfg;
	}
	public void setMfg(Date mfg) {
		this.mfg = mfg;
	}


	}


