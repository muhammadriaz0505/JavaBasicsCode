package com.syntax.class06;

import java.util.Scanner;

public class HwQuestionCalculators {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1=input.nextInt();
		int num2=input.nextInt();
		System.out.println("Please enter the operator");
		char op=input.next().charAt(0);
		double result=0;
		String operator=null;
		switch(op) {
		case '*':
			result=num1*num2;
			break;
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				System.out.println("Invlid result");
				operator="invalid";
				
		}
		if(result!=0 || operator==null) {
			System.out.println(num1+" "+op+" "+num2+" = "+result);	
		}
		input.close();
		
	}

}
