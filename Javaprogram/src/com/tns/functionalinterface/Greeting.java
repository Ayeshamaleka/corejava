package com.tns.functionalinterface;
//demo for functional interface allows only one abstract method and multiple concrete methods 
@FunctionalInterface
public interface Greeting {
	
	//abstract method(SAM)
	void greet();
	
	//multiple concrete methods 
	default void show() {
		
	}
	
	default void print() {
		
	}
		
}
