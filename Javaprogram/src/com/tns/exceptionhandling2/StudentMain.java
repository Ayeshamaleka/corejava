package com.tns.exceptionhandling2;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		Studentdetails ob=new Studentdetails();
		ob.setName(name);
		ob.setMarks(marks);
				
	}
 
}
