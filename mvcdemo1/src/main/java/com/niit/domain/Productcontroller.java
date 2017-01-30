package com.niit.domain;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.domain.Product;
public class Productcontroller {

	public Productcontroller() {
		System.out.println("CREATED PRODUCTCONTROLLER");
	}
	@RequestMapping("/PRODUCT FORM")
	public String getProductForm(Model model){
		model.addAttribute("product", new Product());
		return "PRODUCT FORM";
	}
		public ModelAndView displayProductDetails(@ModelAttribute ("product")Product product ){
			
		return new ModelAndView ("displayProduct","productObj",product);
		
	}
}


