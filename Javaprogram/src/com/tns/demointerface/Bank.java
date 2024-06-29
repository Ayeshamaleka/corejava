package com.tns.demointerface;
//demo for interface
public interface Bank {
	
	//final variables
	public double MINBAL=2000;
	public double DEPOSIT_LIMIT=20000;
	//interface does not allow instance variables
	//public int accid;
		
	//abstract methods
	void withdraw(Account account, double amount);
	void deposit(Account account, double amount);
	
	//interface will not allow concrete methods
	//void show() {
		
	}
	
	
	

}
