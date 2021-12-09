package com.practice.programs;

public class SwapTwoNumbersWithoutUsingThirdVariable {
       
	  public static void main(String[] args) {
		  int a=10;
	       int b=20; 
		  //10+20=30
		  //20-10=10
		   
	       a=a+b;
	       b=a-b;
	       a=a-b;
		   System.out.println(a+" "+b);
		  
	}
}
