package com.practice.programs;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {

		int count = 1;

		String str = "one two three four five";

		for (int i = 0; i < str.length() - 1; i++) {

			if ((str.charAt(i) == ' ') && (str.charAt(i + 1)!= ' ')) {

				count++;
			}
		}
		System.out.println(count);
	}

}
