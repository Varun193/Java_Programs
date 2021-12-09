package com.practice.programs;

import java.util.HashMap;

public class StringWordOccuraneUsingHashMap {

	public static void main(String[] args) {
		String[] na = "my name is m name is varun".split(" ");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		int count = 0;
		for (String s : na) {
			if (hashMap.containsKey(s)) {

				count++;
				hashMap.replace(s, count);

			} else {

				hashMap.put(s, 1);
			}
		}for (String key : hashMap.keySet()) {
			System.out.println(key + " "+ hashMap.get(key));
		}

	}

}
