package com.CoffeeShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.CoffeeShop.dao.ProductDao;
import com.CoffeeShop.model.Product;
import com.CoffeeShop.service.ProductService;



@Controller
public class ProductController {
@Autowired
	private ProductService  productservice;
@Autowired
private ProductDao  productDao;
	public  ProductController(){
	System.out.println("CREATING INSTANCE FOR PRODUCTCONTROLLER");	
	}
	//http://localhost:8080/helloworld/productform
	@RequestMapping("admin/product/productform")
	public String getProductForm(Model model){
		//Product product=new Product();
		model.addAttribute("product", new Product());
		return "productform";
	}
	@RequestMapping("admin/product/addProduct ")
	public ModelAndView saveProduct(@ModelAttribute(value="product")Product product){
		Product newProduct=productservice.saveProduct(product)	;
	return new ModelAndView("ProductList","product",newProduct);
	}

}
