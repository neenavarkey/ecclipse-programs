package com.CoffeeShop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class Homecontroller {

	public Homecontroller() {
System.out.println("INSTANTATING HOME CONTROLLER");
	}
@RequestMapping("/home")
public String home(){
	return "home";
}
@RequestMapping("/aboutus")
public String aboutus(){
	return "aboutus";
}
}
