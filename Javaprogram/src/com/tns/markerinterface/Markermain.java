package com.tns.markerinterface;

public class Markermain {

	public static void main(String[] args) {
	 
		Student ob=new Student(101, "AYESHA", "ECE");
		
		if(ob instanceof Register)
			System.out.println("Student is Registered");	
		else 
			System.out.println("Student is not registered");
		
	}

}
