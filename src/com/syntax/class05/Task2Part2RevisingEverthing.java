package com.syntax.class05;

import java.util.Scanner;

public class Task2Part2RevisingEverthing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int day=input.nextInt();
		if(day>=1 && day<=5) {
			System.out.println("weekday");
		}else if(day>=6 && day<=7) {
			System.out.println("weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
