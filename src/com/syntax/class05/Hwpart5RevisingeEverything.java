package com.syntax.class05;

import java.util.Scanner;

public class Hwpart5RevisingeEverything {

	public static void main(String[] args) {

     Scanner input=new Scanner(System.in);
     String month=input.nextLine();
     if(month.equals("March") || month.equals("April") || month.equals("May")) {
    	 System.out.println("You were born in Spring");
    	 
     }else if(month.equals("June") || month.equals("July") || month.equals("August")) {
    	 System.out.println("You were born in Summer");
     }else if(month.equals("September") || month.equals("October") || month.equals("November")) {
    	 System.out.println("You were born in Autum");
    	 
     }else if(month.equals("December") || month.equals("January") || month.equals("febuary")){
    	 System.out.println("You were born in Spring");
    	 
     }
    
	}

}
