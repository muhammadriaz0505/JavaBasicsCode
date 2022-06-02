package com.syntax.class05;

import java.util.Scanner;

public class Task2Part1RevisingEveryThing {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int height=input.nextInt();
	if(height<60) {
		System.out.println("short");
	}else if(height>=60 && height<72) {
		System.out.println("medium");
	}else if(height>72) {
		System.out.println("tall");
	}

	}

}
