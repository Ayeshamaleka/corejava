package com.tns.arraydemo;

import java.util.Arrays;

public class Demoarray {	
	public static void main(String[] args) {
		
		int[] a= {10,2,3,47,278,78};
		Arraydemo.printArray(a);
		
		Arrays.sort(a); //array operation using sort
		System.out.println("THE ARRAY ELEMENTS AFTER SORTING");
		System.out.println(Arrays.toString(a));	
		//predefined methods -->equals,binary search,bubble sort etc
	}
	
	
//		
//	//	Arraydemo arr=new Arraydemo();		
//        //declare
//		int[] arr;
//		//initalization
//		arr=new int[3];
//		//combination of both
//		int[] arr1=new int[2];
//		
//		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		//method 1 to iterating
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("The elements in array"+arr[i]);
//			
//		}
//			
//		int a[] = {101,102,103,104,105};
//		//method 2 to iterating {for-each loop}
//		for(int i:a) {
//			System.out.println("the elements in array"+i);		
//		}
//	
//	}

}
