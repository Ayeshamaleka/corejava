package com.tns.constructor;
//demo for this keyword
public class Student {
	int rollno;   //properties or actual parameters
	String name;
	
	Student(int rollno , String name) {  //formal parameter
		this.rollno=rollno;
		this.name=name;
		
	}
	public static void main(String[] args) {
		Student s=new Student(1,"ayesha");	
	
	
	boolean op= s instanceof Student;
	System.out.println(op);
	
	}
	
	

}
