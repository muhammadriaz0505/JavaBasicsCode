package com.syntax.class08;

public class ForLoopsPracticeReview {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<6; i++) {
			
			sum+=i;
			
			}
		System.out.print(sum);
		System.out.println();
		//write a program sum of all even and all odd numbers from 1 to 70
		int sum1=0;
      for(int i=2; i<=70; i+=2) {
    	  sum1+=i;
      }
      System.out.println(sum1);
      System.out.println("____________________");
      int sum2=0;
      for(int i=1; i<=70; i++) {
    	  if(i%2==0) {
    		sum2+=i;
    		
    	  }
      }
      System.out.println(sum2);
      System.out.println("_____________________");
      int sum3=0;
      for(int i=1; i<=70; i+=2) {
    	  sum3+=i;
    	  }
      System.out.println(sum3);
      System.out.println("________________");
      int sum4=0;
      for(int i=1; i<=70; i++) {
    	  if(i%2!=0) {
    		  sum4+=i;
    	  }
      }
      System.out.println(sum4);
      System.out.println("The sum of even numbers are "+sum2);
      System.out.println("The sum of odd numbers are "+sum4);
	}

}
