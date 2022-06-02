package com.syntax.class08;

import java.util.Scanner;

public class HomeWorkPaartone {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is the integer starting point?");
		int startingPoint=input.nextInt();
		System.out.println("What is the integer ent point?");
		int endPoint=input.nextInt();
		int a=10;
		int sum=0;
		while(a<=50) {
			 sum+=a;
			a+=2;
			
          
           
		}
		System.out.println("The sum of even numbers are "+sum );
		System.out.println("-------------------------");
		int b=11;
		int sum1=0;
		while(b<=50) {
			sum1+=b;
			b+=2;
		}
		System.out.println("The sum of odd numbers is "+sum1);
		System.out.println("-------");
		
			
			}
	
}
	
