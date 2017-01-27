package com.niit.helloworld;

public class GreetingsImpl implements Greetings
{
	private String messsage;
	public GreetingsImpl(String messsage) 
	{
		this.messsage = messsage;
	}
	public String getMesssage()
	{
		return messsage;
	}
public void setMessage(String message)
{
	this.messsage = message;
}
	
public String sayGreetings()
{
	return  this.messsage +"using spring framework" ;
}
	
}	
	
	
	


