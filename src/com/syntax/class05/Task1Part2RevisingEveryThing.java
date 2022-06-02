package com.syntax.class05;

import java.util.Scanner;

public class Task1Part2RevisingEveryThing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		System.out.println("Do you have credit card?");
		boolean creditCard=input.nextBoolean();
		if(creditCard) {
		
		System.out.println("What is the balance on the card?");
		int balance=input.nextInt();
		
			if(balance>1000) {
				System.out.println("Pay off immediately");
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("We can offer you a card");
		
		}

}
}