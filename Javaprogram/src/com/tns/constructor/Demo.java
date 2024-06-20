package com.tns.constructor;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your address");
		String address=sc.next();
		
		System.out.println("enter your cid");
		int cid=sc.nextInt();
		
		Customer c=new Customer();
		c.setCname(name);
		c.setCaddress(address);
		c.setCid(cid);
		
		System.out.println(c);
		
		
	}

}
