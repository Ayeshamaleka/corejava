package com.tns.constructor;
// demo constructor
public class Constructorexample {
	
	Constructorexample() {
		System.out.println("default Constructor");
	}
	Constructorexample(int i) {
		System.out.println("Constructor with 1 parameter");
	}
	Constructorexample(int i , int j) {
		System.out.println("Constructor with 2 parameter");
	}
	Constructorexample(String s, int i) {
		System.out.println("Constructor with diff datatype");
	}
	public static void main(String[] args) {
		Constructorexample e=new Constructorexample ();
		Constructorexample e1=new Constructorexample (1);
		Constructorexample e3=new Constructorexample (3,5);
		Constructorexample e4=new Constructorexample ("ayesha",7);
	}
}

	
	
		

	
		
		
		
	
	
	    
	
	
	
	
	

