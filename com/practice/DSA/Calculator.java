package com.practice.DSA;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("enter operator");
		String operator = input.nextLine();
		char c = operator.trim().charAt(0);

		if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
			System.out.println("enter two numbers");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			if(c=='+') {
				System.out.println(num1+num2);
				
			}
			if(c=='-') {
				System.out.println(num1+num2);
				
			}
			if(c=='*') {
				System.out.println(num1+num2);
				
			}
			if(c=='/') {
				System.out.println(num1+num2);
				
			}
			if(c=='%') {
				System.out.println(num1+num2);
				
			}
			else {
				
				System.out.println("invalid operation");
			}
			

		}
		System.out.println("operator entered is" + input);

	}

}
