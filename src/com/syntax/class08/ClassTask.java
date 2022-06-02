package com.syntax.class08;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		// declare a secret number
		int secretNum=55;
		int guessedNum;
				
		Scanner input=new Scanner(System.in);
		do {
			System.out.println("Guess the secret number");
			guessedNum=input.nextInt();
		}while(guessedNum!=secretNum);
		System.out.println("You got it");

	}

}
