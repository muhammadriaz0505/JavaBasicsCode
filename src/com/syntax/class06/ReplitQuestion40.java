package com.syntax.class06;

import java.util.Scanner;

public class ReplitQuestion40 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		    System.out.println("Enter the name of the instructor");
		    String instructor,teaches;
		    instructor=input.nextLine();
		    switch(instructor){
		      case "Asghar":
		        teaches="Will take care of Java Assignment";
		        break;
		      case "Moazzam":
		        teaches="Will take care of SDLC Assignment";
		        break;
		      case "Weqas":
		        teaches="Will take care of Selenium Assignment";
		        break;
		      case "Asel":
		        teaches="Will take care of every Assignment";
		        break;
		      default:
		        teaches="Invalid instructor selected";
		        break;
		        
		    }
	}

}
