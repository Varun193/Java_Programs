package com.practice.DSA;

public class LSAEvenDigitNumbers {

	public static void main(String[] args) {

		// {10,23,330,4846,587324} 10,4846,10,23,330,4846,587324 contains even number of digits so return as 3

		int[] input = { 10, 2, 330, 4846, 587324 };
		returnEvenDigit(input);
	}

	static void returnEvenDigit(int[] input) {
		int count = 0;
		for (int ele : input) {
			if (res(ele) % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

	static int res(int input) {

		return countDigitsOfNumber(input);

	}

	static int countDigitsOfNumber(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}

		return count;

	}

}
