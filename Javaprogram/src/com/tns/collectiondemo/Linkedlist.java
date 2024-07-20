package com.tns.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList();		
		
		l1.add(20);
		l1.add(30);
		l1.add(30);
		l1.addFirst(10);
		l1.addLast(50);		
		l1.add(3, 40);
		
//		//enhanced for loop // we does not define a size 
//		for(int i:l1) {
//			System.out.println(i);
//		}	
//		System.out.println("The size of the ll is"+l1.size());
				
		//iterating through iterator
		Iterator i=l1.iterator();
		while(i.hasNext()) {
			System.out.println("The elements in the linkedlist are"+i.next() );
		}
   }
}
