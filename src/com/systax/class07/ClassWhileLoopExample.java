package com.systax.class07;

public class ClassWhileLoopExample {

	public static void main(String[] args) {
		int b=100;
		while(b>=50) {
			System.out.print(b+" ");
			b--;
		}
    //print numbers from-1 to-10
		System.out.println();
		int c=-1;
		while(c>=-10) {
			System.out.print(c+" ");
			c--;
		}
		//print numbers from 1 to 20 but only even numbers
		System.out.println("");
		int d=2;
		while(d<=20) {
			System.out.print(d+" ");
			d+=2;
		}
		//2 method
		System.out.println("");
		int f=1;
		while(f<=20) {
			if(f%2==0) {
			System.out.print(f+" ");
		}
			f++;
		}
		System.out.println("");
		int j=20;
		while(j<=100) {
			System.out.print(j+" ");
			j+=2;
		}
		//print odd numbers 1 to 100
		int r=100;
		while(r>=1) {
			if(r%2!=0) {
				System.out.print(r+" ");
			}
			r--;
		}
	}
	

}
