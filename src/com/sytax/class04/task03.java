package com.sytax.class04;

public class task03 {

	public static void main(String[] args) {
		double mortgageRate=3.5;
		int mortgagePrice=55000;
		if(mortgageRate<4.5) {
			System.out.println("I am buying this house");
			if(mortgagePrice<50000) {
				System.out.println("I am paying cash");
				
			}else {
				System.out.println("I will mortgage the house");
				
			}
		}else {
			System.out.println("I am not buying this house");
		}
	}

}
