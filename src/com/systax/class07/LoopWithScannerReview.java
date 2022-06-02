package com.systax.class07;

import java.util.Scanner;

public class LoopWithScannerReview {

	public static void main(String[] args) {
	//we are going to ask if got a job
		//we will continuously ask you if you get a job untill you say yes
		//once you  say yes "Congratulations"
		Scanner input=new Scanner(System.in);
		String job;
		do {
		System.out.println("Did you get a job");
		job=input.nextLine();
	}while(!job.equalsIgnoreCase("Yes"));
		System.out.println("Congratulations");
		System.out.println("--------------");
		Scanner scan=new Scanner(System.in);
		String offer;
		System.out.println("Did you get a job");
		offer=scan.nextLine();
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job");
			offer=scan.nextLine();
		}
		System.out.println("Congratulations");

}
}