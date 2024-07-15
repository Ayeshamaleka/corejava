package com.tns.interthreadcomm;
//demo inter thread communication
public class ThreadDemo {

	int i;//sending message
	boolean flag=false;
	
	synchronized void deliver(int i) {
		if(flag) 
			try {
				wait();
				
			}
		catch (InterruptedException e) {
				e.printStackTrace();
				System.err.println("Exception Caught");
				
			}
			this.i=i;
			flag=true;
			System.out.println("DATA DELIVERED"+i);
			notify();//notifying to thread 1 or notifying to receiver
					
		}
	
	
	synchronized int receiver() {
		if(!flag) 
			try {
				wait();
				
			}
		catch (InterruptedException e) {
			System.err.println("Exception caught");
				e.printStackTrace();
				
			}
		
			flag=false;
			System.err.println("DATA RECEIVED"+i);
			notify();//notifying to thread 1
			return i;		
	
	}
	
}
