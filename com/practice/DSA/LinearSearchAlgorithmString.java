package com.practice.DSA;

/*
 * Search Exact Character in a String
 */

public class LinearSearchAlgorithmString {

	public static void main(String args[]) {
		
		String input="we are good";
		char target= 'v';

		char ans=searchExactCharacterOfString(input, target);
		System.out.println(ans);
	}

	 static Character searchExactCharacterOfString(String input, char target) {
		
		 for(int i=0; i<input.length(); i++) {
			 char element=input.charAt(i);
			 if(element==target) {
				 return element;
			 }
		 }
		return Character.MAX_VALUE;
		
	}

}
