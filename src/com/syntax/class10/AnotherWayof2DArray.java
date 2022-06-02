package com.syntax.class10;

public class AnotherWayof2DArray {

	public static void main(String[] args) {
		// Create 2d array
		/*
		 * 1 array-->NY--->all cities of NY state
		 * 1 array-->CA--->all cities of CA state
		 * 1 array-->FL--->all cities of FL state
		 * 1 array-->VA--->all cities of VA state
		 */
		String[][] usa= {
				{"New York","Albany","Buffalo"},
				{"Los Angles","San Francisco","San Jose","San Diego","Redding"},
				{"Miami","Orlando","Niceville","Tampa"},
				{"McLean","Richmond","Leesburg"}
		};
		System.out.println(usa[i][2]);
		System.out.println("I want to go to "+usa[2][0]);
		System.out.println("Total # of 1D arrays in array usa = "+usa.length);
		//i want to see how many element inside my first array
		int elem1array=usa[0].length;
		System.out.println("# of elenents in 1 array = "elem1array);
		}

	}

}
