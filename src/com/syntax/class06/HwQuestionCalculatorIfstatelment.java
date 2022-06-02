package com.syntax.class06;

import java.util.Scanner;

public class HwQuestionCalculatorIfstatelment {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("Please enter an operator");
		char operator=input.next().charAt(0);
		String result=null;
		if(operator=='+') {
			System.out.println(a+b);
		}else if(operator=='-') {
			System.out.println(a-b);
		}else if(operator=='*') {
			System.out.println(a*b);
		}else if(operator=='/') {
			System.out.println(a/b);
		}else {
			System.out.println("Invalid operator");
		}
		
		

	}

}
