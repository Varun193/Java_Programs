package com.practice.programs;

public class Palindrome {
	
	public static void main(String[] args) {
		String name1="bob";
		
		String reverse="";
		
		for(int i=name1.length()-1; i>=0; i--) {
			reverse+=name1.charAt(i);
		}
		System.out.println(reverse);
		
		if(name1.equals(reverse)) {
			System.out.println("Palindrome");
		}else
		{
			System.out.println("not Palindrome");
		}
	}

}
