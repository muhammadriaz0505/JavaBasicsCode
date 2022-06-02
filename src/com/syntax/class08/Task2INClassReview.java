package com.syntax.class08;

import java.util.Scanner;

public class Task2INClassReview {

	public static void main(String[] args) {
		// declare a secret nuber;
		//you want to ask user to guess your secret number
		//your code should kept asking to guess until usergers your
		//secret number
		//once user gets the srctet numbers---> you got it
		int secretNum=25;
		int guessNum;
		Scanner input=new Scanner(System.in);
		System.out.println("Guess the secret number");
		guessNum=input.nextInt();
		do {
			System.out.println("Guess the secret number");
			guessNum=input.nextInt();
		}while(guessNum!=secretNum);
		System.out.println("You got it");
		System.out.println("________________________________");
		
			
		}
		

	}


