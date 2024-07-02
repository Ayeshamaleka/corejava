package com.tns.arraydemo;

public class Demoarray {

	public static void main(String[] args) {
		
		//declare
		int[] arr;
		//initialization
		arr=new int[3];
		//combination of both
		int[] arr1=new int[2];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
				
		   int a[]= {101,102,103,104,105};
	//method 2 of iterating (for each loop)
		   for(int i:a) {
			   System.out.println("the elements in array"+i); 
		   }
	
	}

}
