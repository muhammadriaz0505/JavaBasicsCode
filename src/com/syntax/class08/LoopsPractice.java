package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		// write a program to find sum of all even and all odd
		/*
		 * from 1 to70
		 * 
		 */
		int sum=0;
		for(int i=1; i<=70; i++) {
			if(i%2==0) {
				sum+=i;
				
				
			}
		}
		System.out.print(sum+" ");
		System.out.println("");
		int sum1=0;
		for(int i=1; i<=70; i++) {
			if(i%2!=0) {
				sum1+=i;
				
		
		
			}
		}
		System.out.print(sum1+" ");

	}

}
