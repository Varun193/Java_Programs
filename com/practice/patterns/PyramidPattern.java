package com.practice.patterns;

public class PyramidPattern {

	public static void main(String[] args) {
		
		for(int i=1; i<10;i++) {
			for(int j=10; j>=i; j-- ) {
				System.out.print(" ");
			}
			for(int k=i; k<=i; k++) {
				System.out.print("* ");
			}
			for(int l=2; l<=i ; l++) {
				System.out.print("* ");
			}System.out.println();
		}

	}

}
