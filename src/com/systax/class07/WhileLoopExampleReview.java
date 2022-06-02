package com.systax.class07;

public class WhileLoopExampleReview {

	public static void main(String[] args) {
		//print numbers 1 to 10
		int number=1;
		while(number<=10) {
			
			System.out.print(number+" ");
			number++;
		}
		System.out.println();
		//print numbers 1 to 10
		int number1=0;
		
		while(number1<10) {
			number1++;
			System.out.print(number1+" ");
			
		}
		System.out.println();
		int a=10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
			
		}
		System.out.println();
		//print nubers 10 to 1
		int b=10;
		while(b>=1) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		//print numbers 100 to 50
		int c=100;
		while(c>=50) {
			System.out.print(c+" ");
			c--;
		}
		System.out.println();
		//print numbers -1 to -10
		int d=-1;
		while(d>=-10) {
			System.out.print(d+" ");
			d--;
		}
		System.out.println();
		//print numbers 1 to 20 only  even numbers
		int e=2;
		while(e<=20) {
			System.out.print(e+" ");
			e+=2;
		}
		System.out.println();
		int f=1;
		while(f<=20) {
			if(f%2==0) {
				System.out.print(f+" ");
			}
				f++;
				
			}
		System.out.println();
		//even numbers 20 to 100
		int g=20;
		while(g<=100) {
			if(g%2==0) {
				System.out.print(g+" ");
			}
			g++;
		}
		System.out.println();
		int h=20;
		while(h<=100) {
			System.out.print(h+" ");
			h+=2;
		}
		System.out.println();
		//only odd numbers 100 to 1
		int i=100;
		while(i>=1) {
			if(i%2!=0) {
			System.out.print(i+" ");
			}
			i--;
		}
		System.out.println();
		int j=99;
		while(j>=1) {
			System.out.print(j+" ");
			j-=2;
		}
		
		}
	}


