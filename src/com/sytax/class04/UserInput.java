package com.sytax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//creating a scanner
		Scanner input=new Scanner(System.in);
		//send instruction to the console
		System.out.println("Plese enter your name");
		//we need to grab the value from console
		String name= input.next();
		System.out.println(name);
		//let's send instruction
		System.out.println(name+" please enter your age ");
		//need to capture and store age
		int age=input.nextInt();
		System.out.println(name+" is "+age+" years old");
		System.out.println("pleae enter your height");
		int height=input.nextInt();
		System.out.println(name+" is "+age+" years old and "+height+" feet tall");
		
		
		
		

	}

}
