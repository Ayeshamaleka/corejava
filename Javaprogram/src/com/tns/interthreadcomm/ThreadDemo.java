package com.tns.interthreadcomm;
//demo inter thread communication
public class ThreadDemo {

	int i;//sending message
	boolean flag=false;
	synchronized void deliver(int i) {
		if(flag) {
			try {
				wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			this.i=i;
			flag=true;
			System.err.println("DATA DELIVERED"+i);
			notify();//notifying to thread 1 or notifying to receiver
					
		}
	}
	
	synchronized int receiver() {
		if(flag) {
			try {
				wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		
			flag=false;
			System.err.println("DATA RECEIVED"+i);
			notify();//notifying to thread 1
			return i;		
		}
		return i;
		
	}
	
}
