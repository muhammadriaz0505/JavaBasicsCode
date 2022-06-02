package com.syntax.class10;

import java.util.Scanner;

public class GroupProjectQuestion02 {

	public static void main(String[] args) {
		// Using Scanner create an array of countries. When an array is 
		//created, retrieve all values from it and while retrieving those 
		//values print capital for each country.
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the countries names");
		String names=input.nextLine();
		System.out.println("Please enter the capital of those countries");
		String cap=input.nextLine();
		String[][] countriesAndCapitals= {
				{"USA","England","Pakistan","Rassia"},
				{"Washington DC","London","Islamabad","Mosco"}
		};
		for(int country=0; country<countriesAndCapitals.length; country++) {
			for(int capital=0; capital<countriesAndCapitals[country].length; capital++) {
				
				System.out.print(countriesAndCapitals[country][capital]+" ");
				}
		System.out.println();
		
	}
		System.out.println("Printing countries and their capitals by Enhanced Loop");
		for(String[] a:countriesAndCapitals) {
			for(String b:a) {
				System.out.print(b+" ");
				
			}
			System.out.println();
		}
		
	}
}
