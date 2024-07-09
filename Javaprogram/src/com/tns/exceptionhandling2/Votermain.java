package com.tns.exceptionhandling2;

import java.util.Scanner;

public class Votermain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		Voter ob=new Voter();
		ob.setName(name);
		ob.setAge(age);
	
	}

}
