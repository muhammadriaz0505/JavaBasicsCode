package com.syntax.class05;

import java.util.Scanner;

public class Task03Class05 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("You are short");
		int height1=input.nextInt();
		System.out.println("You are medium");
		int height2=input.nextInt();
		System.out.println("You are tall");
		int height3=input.nextInt();
		if(height1>height2 && height1>height3) {
		System.out.println("you are shaot");	
		}else if(height2>height1 && height2>height3) {
			System.out.println("you are medium");
		}else if(height3>height1 && height3>height2) {
			System.out.println("You are tall");
		}

	}

}
