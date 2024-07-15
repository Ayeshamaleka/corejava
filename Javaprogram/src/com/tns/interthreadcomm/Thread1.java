package com.tns.interthreadcomm;

public class Thread1 extends Thread {
	
	ThreadDemo td;

	public Thread1(ThreadDemo td) {
		
		this.td = td;
	}
	
	public void run() {
		for(int j=1;j<5;j++) {
			td.deliver(j);
		}
	}
	

}
