package com.sytax.class04;

public class Donor {

	public static void main(String[] args) {
		int age=17;
		double weight=150;
		if(age>=18) {
			System.out.println("Age wise you are eligible to donate the blood");
			if(weight>110) {
				System.out.println("Weight wise you are eligible too ");
				System.out.println("You can donate the blood");
			}else {
				System.out.println(" But You are underweight");
				System.out.println("You cannot donat the blood");
			}
			
		}else {
			System.out.println("We cannot accept such a patient");
		}
	}

}
