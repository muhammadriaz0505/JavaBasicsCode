package com.syntax.class08;

public class NestedLoopIntroReview {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
			for(int y=1; y<=2; y++) {
				System.out.println("Bye");
			}
			
		}
		System.out.println("---------------");
		for(int i=1; i<=3; i++) {
			
			for(int y=1; y<=2; y++) {
				System.out.println(i+" "+y);
			}
		}
		for(int i=1; i<=3; i++) {
			System.out.println("Hello");
			for(int y=1; y>=2; y++) {
				System.out.println("Bye");
			}
			
			
				
			
		}
		

	}

}
