package com.syntax.class05;

import java.util.Scanner;

public class HwPart3RevisingEverything {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many years you worked?");
		int years=input.nextInt();
		if(years>5) {
			System.out.println("You are eligible for bonus");
			System.out.println("What is your salary?");
			int salary=input.nextInt();
			if(salary>50000) {
				System.out.println("Your bonus is 500");
				
			}else {
				System.out.println("Your bonus is 300");
			}
		}else {
			System.out.println("You are not eligible for bonus");
		}
		
	}

}
