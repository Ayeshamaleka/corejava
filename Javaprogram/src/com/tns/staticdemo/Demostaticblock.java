package com.tns.staticdemo;
//demo for static block
public class Demostaticblock {
	
	static int serialno=10;
	
	//static block
	static {
		System.out.println("......Inside static block......");
		
	}
	//static method
	static void display() {
		System.out.println("-----Inside static method-----");
		System.out.println(serialno++);
		
	}
	//non static method
	void print() {
		System.out.println(serialno++);
		
	}
		 
}
