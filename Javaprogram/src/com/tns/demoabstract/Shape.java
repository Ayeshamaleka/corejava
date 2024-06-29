package com.tns.demoabstract;
//demo for abstract
//abstract class will have abstract method and concrete method
public abstract class Shape {
	
	public float area;
		
	//abstract method
	abstract void calArea();
	
	
	//concrete method
	public void show() {
		System.out.println("The area is "+area);
	}
	
	
	
	
	
	
	

}
