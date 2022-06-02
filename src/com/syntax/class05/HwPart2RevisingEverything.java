package com.syntax.class05;

import java.util.Scanner;

public class HwPart2RevisingEverything {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your city name?");
		String city=input.nextLine();
		System.out.println("What is the temperature?");
		double temp=input.nextDouble();
		double fahrenheit,celsius;
		fahrenheit=45;
		celsius=((fahrenheit-32)*5)/9;
		System.out.println("The remperature is the city " +city+" is "+celsius);
	
	
		
	}

}
