package com.syntax.class06;

import java.util.Scanner;

public class ReplitQuestion42 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		    System.out.println("Enter the roll number of the Child");
		    int rollNumber=input.nextInt();
		    String name;
		    switch (rollNumber) {
		      case 101:
		        name="Student name: Ramesh";
		        break;
		      case 102:
		        name="Student name: Mahesh";
		        break;
		      case 103:
		        name="Student name:Mukesh";
		        break;
		      default:
		        name="Not found Student name: in Class";

	}
	}
}
