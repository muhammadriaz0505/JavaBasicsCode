package com.syntax.class10;

public class ClassTask01A {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number
		int[] num= {5,10,25};
		if(num[0]>num[1] && num[0]>num[2]) {
		System.out.println(num[0]+" is the largest number");	
		}else if(num[1]>num[0] && num[1]>num[2]) {
			System.out.println(num[1]+" is the largest number");
		}else if(num[2]>num[0] && num[2]>num[1]) {
			System.out.println(num[2]+" is the largest number");
		}
		System.out.println(" ");
		char[] characters= {'A','B','C','D','E'};
		for(int i=0; i>characters.length; i--) {
			System.out.println(characters[i]+" ");
			
		}

	}

}
