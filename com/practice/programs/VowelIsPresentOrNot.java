package com.practice.programs;

public class VowelIsPresentOrNot {
	
	public static void main(String[] args) {
	
		String b="Varun";
		char[] chars= b.toCharArray();
		
		for(char c: chars) {
			if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u') {
				System.out.println("vowel");
			}else {
				System.out.println("not vowel");
			}
		}
		

	}

}
