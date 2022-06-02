package com.syntax.class06;

import java.util.Scanner;

public class HwDiscoutQuestion {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double price;
	double discount=0.0;
	double finalprice=0.0;
	double discountamount;
	System.out.println("Is there a sale?");
	boolean sale=input.nextBoolean();
	if(sale) {
	 System.out.println("Which item you want to buy?");
	 String item=input.next();
	 System.out.println("What is the price of the item?");
	     price=input.nextDouble();
	
	 
		 if(price<20) {
			 discount=10;
			
		 }else if(price>=20 && price<100) {
			 discount=20;
			 
		 }else if(price>=100 && price<500) {
			 discount=30;
			 
		 }else {
			 discount=50;
			 
		 }
		 discountamount=price*discount/100;
		 finalprice=price-discountamount;
		 System.out.println("After discount "+discountamount+" the price of the item reduce from "+price+" to "+finalprice);
		 
	 }else {
		 System.out.println("I am not going for shoping");
	 }
	 

	}

}
