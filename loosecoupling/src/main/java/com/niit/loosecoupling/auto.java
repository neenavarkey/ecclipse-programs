package com.niit.loosecoupling;

public class auto implements vehicle{
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	private double cost;
	
	public double getcostdetails()
	{
		return this.cost;

}
}
