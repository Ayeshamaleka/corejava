package com.tns.swapping;

import java.util.Scanner;

public class PrimeChecker {
	public static boolean checkPrime(int n) {
		if(n<=1) {
			return false; }
				
		for(int i=2; i<=Math.sqrt(n); i++);{
		
		int i = 0;
		if(n%i==0) {
			return false;}}
	return true;}
	
	public static void printPrimeInRange(int a, int b) {
		if(a>=0 && b>=0 && a<=b) {
			for (int num=a; num<=b; num++) {
				if(checkPrime(num)) { 
					System.out.print(num+ "");}}
			
		}else {
				System.out.println("Provide valid input");}}
			 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("");
			int a = sc.nextInt();
			int b = sc.nextInt();
			printPrimeInRange(a,b);
	
		}}