package com.tns.demoexception;

public class Withexception {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		try {
			int result=a/b;
			System.out.println("The result is"+result);
			
		}
		catch(Exception e) {
			System.out.println("Division by zero is not allowed");
			//System.out.println(e);
			
		}
	}

}
