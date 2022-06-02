package com.syntax.class08;

import java.util.Scanner;

public class Task2WithWhileMethod {

	public static void main(String[] args) {
		int secretNum=25;
		int guessNum;
		Scanner input=new Scanner(System.in);
		System.out.println("Guess the secret number");
		guessNum=input.nextInt();
		
		while(guessNum!=secretNum);{
		System.out.println("You got it");
		}
	}

}
//not solved that yet