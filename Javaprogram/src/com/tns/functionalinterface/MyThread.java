package com.tns.functionalinterface;

public class MyThread extends Thread {
	@Override

    public void run() {

        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());

    }

}
		
