package com.practice.programs;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		//3!= 3*2*1
		
		Scanner sc = new Scanner(System.in);
		//int N= sc.nextInt();
		int N= 3;
		int fact=1;
	
	    for(int i=1;i<=N;i++) {
	    	fact=N*(N-1);
	    }
	     
		System.out.println(fact);
	}

}
