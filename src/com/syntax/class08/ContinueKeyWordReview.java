package com.syntax.class08;

public class ContinueKeyWordReview {

	public static void main(String[] args) {
		// Continue -skips current execution/iteration
		//When java executes continue
		//go back to the beginning of the loop
		//will be skipped /ignored
		for(int i=1; i<=5; i++) {
			if(i==2) {
				continue;
			}
			System.out.print(i+" ");
			System.out.println("Hello");
			System.out.println("We are going on a break");
		}
		System.out.println("------------");
		//print numbers 1 to 10 skip number 5 and 7
		for(int i=1; i<=10; i++) {
			if(i==5 || i==7) {
				continue;
			}
			System.out.print(i+" ");
			
		}

	}

}
