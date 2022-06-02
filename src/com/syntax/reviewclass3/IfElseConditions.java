package com.syntax.reviewclass3;

public class IfElseConditions {

	public static void main(String[] args) {
		String user="Asghar";
		String password="pass123";
		//when we use primitive data types like byte short int long float double char boolean
		//we use ==
		//whenever we use non-primitive data types we use .equals method String
		if(user.equals("asghar") && password.equals("pass123")){
			System.out.println("Welcome back to syntax");
		}else {
			System.out.println("user or password is not correct");
		}
		//Debugging make sure
		//you have not disabled the breakpoint
		//you have not enabled the skip all breakpoints option in debug window
	}
}
