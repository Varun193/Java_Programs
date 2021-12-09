package com.practice.programs;

public class ToCheckIfLettersOccursEachLettersExcatlyOnce {

	public static void main(String[] args) {
		
		String str= "abc";
		
		if(Check(str.toCharArray())==true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

	 static boolean Check(char[] charArray) {
		
		int l= charArray.length;
		 for(int i =1; i <l ; i++) {
			 if(charArray[i]-charArray[i-1]!=1 ) {
				 return true;
			 }
		 }
		 
		return false;
	}

}
