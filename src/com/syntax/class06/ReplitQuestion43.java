package com.syntax.class06;

import java.util.Scanner;

public class ReplitQuestion43 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		    System.out.println("Input a number between 1-12");
		    int month=input.nextInt();
		    String name;
		    switch (month) {
		      case 1:
		        name="January";
		        break;
		      case 2:
		        name="February";
		        break;
		      case 3:
		        name="March";
		        break;
		      case 4:
		        name="April";
		        break;
		      case 5:
		        name="May";
		        break;
		      case 6:
		        name="June";
		        break;
		      case 7:
		        name="July";
		        break;
		      case 8:
		        name="August";
		        break;
		      case 9:
		        name="September";
		        break;
		      case 10:
		        name="October";
		        break;
		      case 11:
		        name="November";
		        break;
		      case 12:
		        name="December";
		        break;
		        default :
		        name="Invalid";
		        break;

	}
		    System.out.println("name");
	}
}
