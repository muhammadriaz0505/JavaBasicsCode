package com.syntax.class10;

public class AllElementsOf2DArray {

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
				//outer loop iterates over rows
				//inner loops iterates over columns
				for(int row=0; row<usa.length; row++) {
					for(int col=0; col<usa[row].length; col++) {
						System.out.print(usa[row][col]+" ");
						
			}
		
					System.out.println();
		}
	}

	}


