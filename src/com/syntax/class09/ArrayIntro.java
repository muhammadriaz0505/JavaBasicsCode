package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		//create a array
		int[] b=new int[4];
		//store values
		b[0]=90;
		b[1]=85;
		b[2]=70;
		b[3]=100;
		//sccess values from my array
		System.out.println((b[2]));
		System.out.println(b[1]+b[3]);
		//We need to create a array of my classmates names
		String[]classMates=new String[5];
		classMates[0]="Khrystyna";
		classMates[1]="Zameer";
		classMates[2]="Elexia";
		classMates[3]="Oleg";
		classMates[4]="Adem";
		System.out.println("My classmate name is "+classMates[3]);

	}

}
