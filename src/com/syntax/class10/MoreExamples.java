package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		int[][] nums= {
				{1,2,3,4,5},
				{199,300,588,700},
				{1900,4578,98787}
				};
		/*
		 * i loop
		 */
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("All value using enhenced for loop");
		
	}

}
