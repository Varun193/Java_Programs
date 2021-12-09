package com.practice.programs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int N= sc.nextInt();
		int N= 153;
		//153 =1^3+5^3+3^3
		int pw=3;
		double res=0;
		
		while(N!=0) {
			int rem = N%10;
			res= res+ Math.pow(rem, 3);
			
			N=N/10;
		}
		
		System.out.println(res);
		if(res != N) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
		
		
	}

}
