package com.tns.demoexception;

import java.util.Scanner;

public class Withexception {
	


	public static void main(String[] args) {
		
	
//	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a value");
//				
//		int a=sc.nextInt();
//		System.out.println("Enter b value");
//		
//		int b=sc.nextInt();
//		//try is used to handle exception
//		try {
//			int result=a/b;
//			System.out.println("The result is"+result);
//			
//		}
//		catch(Exception e) {
//			System.out.println("Division by zero is not allowed");
//			//System.out.println(e);
//			
//		}
		
		try {
			int[] arr= {10,20,30};
			System.out.println(arr[3]);
			System.out.println("hello...");
			
		}
		catch(Exception e) {
			System.out.println("the specified index is not existing");
		}
	//executed whether error is their or not
		finally {
		System.out.println("hello...");
		int a=10/20;
		System.out.println("The result is" +a);
		}
	}
}

	
	
