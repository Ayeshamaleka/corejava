package com.tns.arraydemo;
//demo for multidimensional array
public class Demomulti {
	
	public static void main(String[] args) {
		
//	//declaration
//	int[] [] arr;  //example1
//	int[] [] arr1;  //example2
//	int arr2[] [];  //example3
//	
//	//initialization
//	arr=new int[3][3];
	
	int arr[] []= {{10,20},{20,30},{30,40}};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			
			System.out.println(arr[i][j]+"");
		}
			System.out.println();
		}
		
	}
		
}


