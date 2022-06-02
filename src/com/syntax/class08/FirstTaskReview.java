package com.syntax.class08;

public class FirstTaskReview {

	public static void main(String[] args) {
		//print even numbers 20 to 1
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		//2nd method if method
		for(int i=20; i>=1; i--) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
		}
		System.out.println();
		//odd numbers 20 to 50
		for(int i=21; i<+50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=20; i<=50; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				
			}
		}

	}

}
