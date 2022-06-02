package com.syntax.class10;

public class ArrayQuickReview {

	public static void main(String[] args) {
		String[] disney= {"Shrek","Else","Goofy","Mulan","Tom&Jerry"};
		System.out.println(disney[1]);//Elsa
		System.out.println("All elements using for loop");
		//to get all elements from an array
		for(int i=0; i<disney.length; i++) {
			if(disney[i].equalsIgnoreCase("Shrek")) {
				System.out.println(disney[i]+" is my favourite character");
			
		}else {
			System.out.println(disney[i]);
		}
		}
		System.out.println("All elements using Enhence for loop");
		for(String character:disney) {
			if(character.equalsIgnoreCase("Mulan")) {
			System.out.print(character+" is my fovourite character ");
		}else {
			System.out.println(character+" ");
		}
				
		}
		
	}
}

