package com.sytax.class02;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// add,subtract,multiply and divide 2 decimal values
		int num1=45;
		int num2=13;
		int sum,sub,div,mult;
		sum=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		System.out.println("The sum of 2 numbers "+num1+" and "+num2+" is equal to "+sum);
		System.out.println("The subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+sub);
		System.out.println("The multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+mult);
        System.out.println("The division of 2 numbers "
        		+num1+ " and "+num2+" is equal to "+div);
	}

}
