package com.tns.interthreadcomm;
//receiver thread
public class Thread2 extends Thread{

	ThreadDemo td;

	public Thread2(ThreadDemo td) {
		super();
		this.td = td;
	}
	
      public void run() {
    	  for(int k=0;k<5;k++) {
    		  td.receiver();
    		  
    	  }	 
 }
	
}
