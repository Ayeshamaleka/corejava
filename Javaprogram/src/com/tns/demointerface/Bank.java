package com.tns.demointerface;
//demo for interface
public interface Bank {
	//final variables
	public double MINBAL=2000;
	public double DEPOSIT_LIMIT=20000;
	//interface doesnot allow instance variables
	//public static final int accid = 0;
	
	
	//abstract method
	void withdraw(Account account, double amount);
	void deposit(Account account, double amount);
	
	//interface will not allow concrete
	//void show() {
		
	
	

}
