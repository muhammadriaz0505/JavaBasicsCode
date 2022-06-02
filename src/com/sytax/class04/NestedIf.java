package com.sytax.class04;

public class NestedIf {

	public static void main(String[] args) {
		boolean vaccine=true;
		int dose=1;
		if(vaccine) {
			System.out.println("Let me check if yoy gost a second dose");
			if(dose==1) {
				System.out.println("you need one more shot");
			}else {
				System.out.println("You are fullly vaccinated");
			}
		}
System.out.println("-------------");
String month="May";
int day=8;
if (month.equals("May")) {
	System.out.println("Let me check what is taday's date");
	if(day==8) {
		System.out.println("Today is Mother's Day");
	}else if(month.equals("June")) {
		System.out.println("Let me check what is today's date");
	}if (day==19) {
		System.out.println("Today is Father's day");
	}
}
	}

}
