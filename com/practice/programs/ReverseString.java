package com.practice.programs;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name="varun";
//		char chars[]= name.toCharArray();
//		
//		for(int i=chars.length-1; i>=0;i--) {
//			System.out.print(chars[i]);
//		}
//	}
		
		String reverse="";
		for(int i = name.length()-1; i>=0 ; i--) {
			
			reverse+=name.charAt(i);
		  }
		System.out.println(reverse);
		}
	
	
	 

}
