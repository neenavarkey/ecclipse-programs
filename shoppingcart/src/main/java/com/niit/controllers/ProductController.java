package com.niit.controllers;

import com.niit.model.Product;

public class ProductController {
	private Product productservice;
	public ProductController() 
	{
		System.out.println("CREATING INSTANCE  FOR PRODUCT CONTROLLER");
	}
	@RequestMapping("/PRODUCT FORM")
	public String getProductForm(Model model){
		//Product product=new Product();
		model.addAttribute("product", new Product());
		return "PRODUCT FORM";
	}
	@RequestMapping("/addProduct ")
	public ModelAndView saveProduct(@ModelAttribute(value="product")Product product){
		
		
	}

}
