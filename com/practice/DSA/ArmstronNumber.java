package com.practice.DSA;

import java.util.Scanner;

public class ArmstronNumber {

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
	 int armStrong = isArmStrong(num);
	 if(armStrong==num) {
		 System.out.println(armStrong+"is armstrong  numbe");
	 }else {
		 System.out.println(armStrong+"is not a armstrong  numbe");
	}
	}


	 static int isArmStrong(int num) {
		int arm=0;
		 while(num!=0) {
			 int rem =num%10;
			  arm+=Math.pow(rem,3);
			  num=num/10;
			
		 }return arm;
		
		
	}

}
