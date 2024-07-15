package com.tns.interthreadcomm;
//executor class
public class Interthreadmain {

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		Thread1 t1=new Thread1(td);
		Thread2 t2=new Thread2(td);
		
		t1.start();
		t2.start();
	}

}
