package com.syntax.class06;

import java.util.Scanner;

public class ReplitQuestion41 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter the age of the Child");
	    int age=input.nextInt();
	    String progress;
	    switch(age){
	      case 1:
	        progress="You can Crawl";
	        break;
	      case 2:
	        progress="You can Talk";
	        break;
	      case 3:
	        progress="You can Dance";
	        break;
	      case 4:
	        progress="You can get Trouble";
	        break;
	      default:
	        progress="I don't know how old you are";
	}
	}
}
