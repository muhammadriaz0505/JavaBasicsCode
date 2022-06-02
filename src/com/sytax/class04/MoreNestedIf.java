package com.sytax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {

  /* we need to check if repl was completed
   * 
   * if repl is completed we want to see
   * id you did 15 and more --> great job
   * if you did more than 10--> did good
   * if less than 10-->try to complete all
   * 
   * 
   */
boolean didRepl=true;
int assignments;
if (didRepl) {
	System.out.println("How many assignments have you done");
	assignments=14;
	if(assignments>15) {
		System.out.println("you did a great job");
	}else if (assignments>10) {
		System.out.println("You did good job");
	}else {
		System.out.println("Please complete all repl assignments");
	}
	
}else {
	System.out.println("You should coplete Repl HW");
}
	}

}
