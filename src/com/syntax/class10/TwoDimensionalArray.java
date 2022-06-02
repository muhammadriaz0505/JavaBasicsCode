package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//To create 2D array we speicfy # of rows and cols=size
		int[][]numbers=new int[3][4];
		//1 row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=20;
		numbers[0][2]=20;
		//2 row
		numbers[1][0]=1;
		numbers[1][1]=2;
		numbers[1][2]=3;
		numbers[1][2]=4;
		//3 row
		numbers[2][0]=9;
		numbers[2][1]=8;
		numbers[2][2]=7;
		numbers[2][2]=6;
		System.out.println(numbers[1][3]);
		System.out.println(numbers[0][1]);
		int rows=numbers.length;
		System.out.println("Numbers of rows "+rows);
		int colsof1row=numbers[0].length;
	}

}
