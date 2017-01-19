package com.niit.loosecoupling;

import org.springframework.context.ApplicationContext;

public class client {

	public static void main(String[] args) {
//travel travel=new travel();
//travel.setKmTravelled(10);
 //car c=new car();
 //c.setCostperkm(100);
 //auto a=new auto();
 //a.setCost(25);
// travel.setvehicle(c);
ApplicationContext context=(ApplicationContext) new FileSystemXmlApplicationContext("beans.xml");
travel travel=(travel)context.getBean("travel");
 System.out.println(travel.gettraveldetails());
 
	}

}
