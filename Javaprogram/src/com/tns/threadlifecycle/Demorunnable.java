package com.tns.threadlifecycle;
//demo for runnable interface
public class Demorunnable implements Runnable {
	public void run() {
		System.out.println("The current thread that is running"
				+Thread.currentThread());
	}

}
