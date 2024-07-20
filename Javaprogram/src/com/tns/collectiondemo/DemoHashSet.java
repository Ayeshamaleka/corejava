package com.tns.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class DemoHashSet {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
        ArrayList<Integer> a=new ArrayList();
		hs.add(100);
		hs.add(32);
		hs.add(30);
		hs.add(20);
		hs.add(63);
	    hs.add(4);
	    
		a.add(100);
		a.add(32);
		a.add(30);
		a.add(20);
		a.add(63);
	    a.add(4);	    
	    
	    //printing elements under HashSet
	    System.out.println("THE ELEMENTS IN HASHSET"+hs);
	    
	    ArrayList<Integer> a1=new ArrayList(hs);
	  //printing elements underArrayList
	    System.out.println("THE ELEMENTS IN HASHSET"+a);
	    
	  //printing elements under Sorting 
		Collections.sort(a1);		
	    System.out.println("THE ELEMENTS IN HASHSET"+a1);
		//HashSet it does not follow order and doesn't allow duplicates 	
//		
//		LinkedHashSet hs=new LinkedHashSet();
//		
//		hs.add(9000);
//		hs.add(30);
//		hs.add(10);
//		hs.add(40);
//		hs.add(40);
//		System.out.println("The elements in LinkedHashSet"+hs);
//		
//	//LinkedHashSet it does not follow order and doesn't allow duplicates 	
//	
	}

}
