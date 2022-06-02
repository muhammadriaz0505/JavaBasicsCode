package com.syntax.class09;

public class HwPart1B {

	public static void main(String[] args) {
		//Create an array of animals and store 5 elements into it
		String[] animals= {"cat","dog","horse","elephant","cow"};
		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]+" ");
				
		}
		System.out.println("____Enhanced Method_____");
		for(String a:animals) {
			System.out.println(a+" ");
		}
	}

}
