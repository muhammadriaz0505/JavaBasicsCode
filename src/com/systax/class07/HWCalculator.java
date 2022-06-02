package com.systax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		double result=0;
		switch (op) {
		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		default:
			System.out.println("Invalid Opertor");
		}
		System.out.println(x + " " + op + " " + y + " = " + result);
		scan.close();
	}
}

