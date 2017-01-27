package com.niit.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	public Homecontroller() {
	System.out.println("CONSTRUCTION HOMECONTROLLER");
	}
	
	@RequestMapping("/homepage")
	public String homepage(){
		return "home";
		
	}
	}


