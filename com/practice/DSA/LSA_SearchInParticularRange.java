package com.practice.DSA;

/*
 * Search in particular range weather the searched element is present or not
 */

public class LSA_SearchInParticularRange {

	public static void main(String[] args) {
		int startRange = 3;
		int endRange = 10;
		int[] input = { 10, 1, 2, 5, 7, 9, 190, 23, 56, 78, 92, 34, -23, -1 };

		int target = 111;

		System.out.println(searchInParticularRange(startRange, endRange, input, target));

	}

	static int searchInParticularRange(int startRange, int endRange, int input[], int target) {

		for (int i = startRange; i <= endRange; i++) {

			if (input[i] == target) {
				return input[i];
			}
		}
		return Constants.NOT_FOUND;
	}

}

class Constants{
	
	public final static int NOT_FOUND=1234;
	
}
