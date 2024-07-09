package com.tns.exceptionhandling2;

public class Student {

	public static void student(int marks) 
	      throws StudentmarksException{
		
		if(marks <0)
			throw new StudentmarksException("The percentage should not be less than zero");
	}
	
	
}
