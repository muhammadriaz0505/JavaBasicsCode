package com.syntax.class09;

public class HwPart1C {

	public static void main(String[] args) {
		//Create an array to store double values and then print all elements
        //using 2 different loops
		System.out.println();
		double[] prices= {5.99,6.99,7.99,10.99,15.99,2.99};
		for(int i=0; i<prices.length; i++) {
		System.out.println(prices[i]+" ");
		
		}
		System.out.println("___Enhanced Method___");
		for(double c:prices) {
			System.out.println(c+" ");
		}


	}

}
