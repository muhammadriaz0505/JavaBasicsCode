package com.syntax.reviewclass02;

import java.util.Scanner;

public class IfElseDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your account balance");
		double accountBalance=scanner.nextDouble();
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend=scanner.nextDouble();
		if(accountBalance>=amountToLend) {
			System.out.println("yes i can heop you");
		}else {
			System.out.println("Sorry i don't have enough money to help you");
		}

	}

}
