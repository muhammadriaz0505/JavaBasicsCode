package com.syntax.class09;

public class HwPart1D {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all the element in an array
		int sum1=0;
		int sum2=0;
		int[] nums= {15,25,35,45,55};
		for(int i=0; i<nums.length; i++) {
			sum1+=nums[i];
			}
		System.out.println("The sum of integers = "+sum1);
		System.out.println("___Enha ced Method_____-");
		for(int a:nums) {
			sum2+=a;
			
			
		}
		System.out.println("The sum of integers= "+sum2);
	}

}
