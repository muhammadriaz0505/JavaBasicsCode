package com.sytax.class04;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// Capture the largest number
		Scanner number=new Scanner(System.in);
		
		System.out.println("What is the value of first number");
		int num1=number.nextInt();
		System.out.println("What is the value of second number ");
		int num2=number.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is the largest number");
		}else {
			System.out.println(num2+" is the largest number");

	}
		
	}

}
