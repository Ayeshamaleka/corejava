package com.tns.threadlifecycle;

public class Demomain {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<5;i++) {
			Demothread ob=new Demothread();
			ob.start();   //call via start method
			
		}
		
	}

}
