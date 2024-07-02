package com.tns.methodoverriding;

public class OverridingMain {

	public static void main(String[] args) {
		
		RBI rbi;
		
		rbi=new SBI();
		System.out.println("The rate of interest for SBI"+rbi.rateofinterest());
		
		rbi=new Axis();
		System.out.println("The rate of interest for Axis"+rbi.rateofinterest());
				
	}
}
