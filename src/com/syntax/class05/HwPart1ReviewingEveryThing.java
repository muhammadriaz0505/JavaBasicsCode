package com.syntax.class05;

import java.util.Scanner;

public class HwPart1ReviewingEveryThing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What amount of loan you needed?");
		int amount=input.nextInt();
		if(amount<=200000) {
			System.out.println("You can lend money");
		}else {
			System.out.println("You would be rejected");
		}

	}

}
