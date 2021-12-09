package com.practice.programs;

public class CountOccurenceInString {

	public static void main(String[] args) {
		
		String str="hello world";
		int count=0;
		
		for(int i=0 ;i<str.length(); i++){
			char ch= str.charAt(i);
			if(str.contentEquals(ch) ) {
				count++;
			}
		
	
	}System.out.println(count);

	}

}
