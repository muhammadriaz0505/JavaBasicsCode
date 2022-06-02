package com.systax.class07;

public class DoWhileReview {

	public static void main(String[] args) {
		int num=1;
		while(num<=3) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println("----------");
		int num1=1;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1<=3);
		//print numbers 1 to 30 using do while
		System.out.println("----");
		int a=1;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<=30);
		System.out.println("-----");
		int b=70;
		do {
			System.out.print(b+" ");
			b-=2;
		}while(b>=30);
		System.out.println(b);
		
	}

}
