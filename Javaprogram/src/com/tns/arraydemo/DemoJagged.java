package com.tns.arraydemo;
//demo for Jagged array
public class DemoJagged {

	public static void main(String[] args) {
		
		int arr[][]= {{10, 20, 30},{20},{30, 20, 40, 50},{1, 4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
				System.out.println();
			}
		}
	
}


