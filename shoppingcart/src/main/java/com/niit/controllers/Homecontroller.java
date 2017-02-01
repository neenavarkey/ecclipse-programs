package com.niit.controllers;

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

