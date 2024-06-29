package com.tns.inheritance2;
//demo for multilevel inheritance
//child class or derived class
public class State extends Country {
	
	//variables	
	public String Statename;
    		
	public State(String statename) {
		//super is to represent base class or parent class variables
		super();
		//this keyword current class
		this.Statename = statename;
	}

	public String getStatename() {
		return Statename;
	}

	public void setStatename(String statename) {
		Statename = statename;
	}
	
	
	
	
	

}
