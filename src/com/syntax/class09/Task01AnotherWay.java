package com.syntax.class09;

public class Task01AnotherWay {

	public static void main(String[] args) {
		char[] grade= {'A','B','C','D','E','F'};
		/*
        System.out.println(grade[0]);
        *System.out.println(grade[1]);
        *System.out.println(grade[2]);
        *System.out.println(grade[3]);
         */
		for(int i=0; i<grade.length; i++) {
			System.out.print(grade[i]+" ");
		}
		System.out.println("-------");
		String[]words= {"Java","Saturday","day"};
		//I want to retrieve all the elements
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println("");
		//Enhanced for loop/advanced for looop/for each loop
		//CAN BE ONLY WHEN WE WORK WITH ARRAY
		System.out.println("The End");
	}
	

}
