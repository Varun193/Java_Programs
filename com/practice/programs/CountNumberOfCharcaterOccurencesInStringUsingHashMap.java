package com.practice.programs;

import java.util.HashMap;

public class CountNumberOfCharcaterOccurencesInStringUsingHashMap {

	public static void main(String[] args) {

		String str = "we are going to bangalore";
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		int count;
		char ch;
		
		for(int i=0; i<str.length()-1; i++) {
			ch=str.charAt(i);
			if(hashMap.containsKey(ch)) {
				count=hashMap.get(ch);
				count++;
				hashMap.replace(ch, count);
			}else {
				hashMap.put(ch, 1);
			}
		}
		for(Character key: hashMap.keySet()) {
			System.out.println(key + " " + hashMap.get(key));
		}

	}

}
