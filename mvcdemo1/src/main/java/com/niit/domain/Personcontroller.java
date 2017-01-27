package com.niit.domain;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.niit.domain.Person;


public class Personcontroller{
public Personcontroller()
{
	System.out.println("CREATING PERSONCONTROLLLER");
}

@RequestMapping("/Add Person")
public ModelAndView getPersonDetails
(@ModelAttribute ("person")Person person ){
	
return new ModelAndView ("displayDetails","person",person);
}

@RequestMapping("/getPersonForm")
public String getPersonForm(Model model){
	model.addAttribute("person", new Person());
	return "personaldetails";
	
}

}

	


