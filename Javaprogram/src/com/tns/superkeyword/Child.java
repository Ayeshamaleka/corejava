package com.tns.superkeyword;

public class Child extends Parent {
	
	int a=3;
	
	void drink() {
		System.out.println("boost");
	}
//	void print() {
//		System.out.println(a);
//		System.out.println(super.a);
//	}
	void display() {
		drink();
		super.drink();
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		
		System.out.println(c.a);
	    c.drink();
		//c.print();
	    c.display();
				
		}

}
