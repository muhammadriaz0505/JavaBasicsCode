package com.sytax.class04;

import java.util.Scanner;

public class UserInputHomework {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your first name");
		String firstName=input.next();
		System.out.println("My first name is "+firstName);
		System.out.println("What is your last name");
		String lastName=input.next();
		System.out.println("My first name is "+firstName+" and my last name is "+lastName);
		System.out.println("Which State do you live");
		String state=input.next();
		System.out.println("My first name is "+firstName+" and my last name is "+lastName+" and i live in "+state);
		//creating a new scanner
		
		

	}
	
}

