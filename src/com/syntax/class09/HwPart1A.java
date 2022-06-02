package com.syntax.class09;

public class HwPart1A {

	public static void main(String[] args) {
		String[] cars= {"toyota","honda","ford","mazda","lexus","bmw"};
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+ " ");
				
		}
		System.out.println("____Enhanced Method_____");
		for(String a:cars) {
			System.out.println(a+" ");
			
		}
		
	}

}
