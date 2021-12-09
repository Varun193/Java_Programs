package com.practice.DSA;

import java.util.Scanner;

class Prime {

	public static void main(String args[]) {
		System.out.println("ENter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// sysout(isPrime(n));
		System.out.println(isPrime(n));

	}

	static boolean isPrime(int num) {
		if (num >1 &&num % num == 0 && num / 2 == 0) {
			System.out.println(num + "prime number");
               return true;
		}else {
			System.out.println("not a prime number");
			return false;
		}
		

	}

}