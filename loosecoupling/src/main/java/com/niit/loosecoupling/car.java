package com.niit.loosecoupling;

public class car implements vehicle{
	private double costperkm;
public double getCostperkm() {
		return costperkm;
	}

	public void setCostperkm(double costperkm) {
		this.costperkm = costperkm;
	}
public double getcostdetails()
{
	return this.costperkm;
}
	




}
