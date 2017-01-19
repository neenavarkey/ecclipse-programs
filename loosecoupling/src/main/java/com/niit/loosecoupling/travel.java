package com.niit.loosecoupling;

public class travel {
	private int kmTravelled;
	private vehicle vehicle;
	
	public int getKmTravelled() {
		return kmTravelled;
	}
	public void setKmTravelled(int kmTravelled) {
		this.kmTravelled = kmTravelled;
	}
	
	
	
public String gettraveldetails()
{
	return "totalcost"+this.getKmTravelled() * vehicle.getcostdetails();
	
}
}
