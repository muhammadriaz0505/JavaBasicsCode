package com.syntax.class05;

import java.util.Scanner;

public class Task01Class5 {

	public static void main(String[] args) {
		Scanner task=new Scanner(System.in);
		System.out.println("What is your age?");
		int age=task.nextInt();
		System.out.println(age);
		if(age>=18) {
			System.out.println("We can issue a driver license");
		}else {
			System.out.println("You have to get a learner permit");
		}

	}

}
