package com.tns.scannerclass;

public class Taxcalculation {
	public void calculatetax(Person p)   {
		if(p.getIncome()<=1600)   {
			p.setIncome(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<=15000)
		{
p.setTax(10);
		}
		else {
			p.setTax(10);
		
		}
	}

}
