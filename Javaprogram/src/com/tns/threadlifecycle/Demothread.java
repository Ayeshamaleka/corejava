package com.tns.threadlifecycle;
//demo for thread lifecycle using Thread class/runable interface
public class Demothread extends Thread {

	public void run () {
		System.out.println("The current thread that is running"
				+Thread.currentThread());
		
	}
}
