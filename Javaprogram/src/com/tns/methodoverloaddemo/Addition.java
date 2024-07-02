package com.tns.methodoverloaddemo;
//demo for method overloading -- compile time polymorphism
public class Addition {

	public static int addition(int a,int b) {
		
		int result;		
		return result=a+b;	
		
		
	}
	
      public static int addition(int a,int b,int c) {
		
		int result;		
		return result=a+b+c;
      }

      public static int addition(int a,float b) {
      		
  		 float result =a+b ;		
  		 		
  		System.out.println("The result of 3rd method "+result);
		return 0;
		
  		}
	
}
	

