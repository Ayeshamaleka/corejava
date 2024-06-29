package com.tns.demointerface;

public class Bankmain {

	public static void main(String[] args) {
		
		Bank bank=new Bankimplementation();
		
		Account account = new Account(101,"Ayesha",1500,bank);
		
		bank.withdraw(account, 500);
		bank.deposit(account, 20000);
				

	}

}
