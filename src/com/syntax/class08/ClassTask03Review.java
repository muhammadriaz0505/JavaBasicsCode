package com.syntax.class08;

import java.util.Scanner;

public class ClassTask03Review {

	public static void main(String[] args) {
		//Print numbers from 1 to 50 except those that are dicisible by 3
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		//create a program that will keep asking user to apply for a credit card
		//As soon you get Yes from user program should stop asking
		Scanner input=new Scanner(System.in);
		System.out.println("Apply for a credit card");
		String creditCard=input.nextLine();
		do {
			System.out.println("Apply for a credit card");
			 creditCard=input.nextLine();
		}while(!creditCard.equalsIgnoreCase("Yes"));
		System.out.println("That's good");

	}

}
