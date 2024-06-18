package com.tns.scannerclass;

import java.util.Scanner;
//demo of scanner class

public class Scannerexample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter you are name");
		String name=sc.nextLine();
		
		System.out.println("enter the student id");
		int sid=sc.nextInt();
		System.out.println("enter the percentage");
		float per =sc.nextFloat();
		

	}

}
