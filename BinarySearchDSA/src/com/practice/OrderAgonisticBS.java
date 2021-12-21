package com.practice;

public class OrderAgonisticBS {

	// we dont know wheather input will asec or desc so we need to check and
	// based on that do search

	public static void main(String[] args) {

		// int[] input = { 12, 15, 67, 86, 100 }; // asc
		int[] input = { 100, 86, 67, 15, 12 };
		int target = 86;
		System.out.println(SearchElement(input, target));
	}

	static int SearchElement(int input[], int target) {
		int start = 0;
		int end = input.length - 1;

		while (start <= end) {

			int mid = start + ((end - start) / 2); // finding mid element

			if (input[start] < input[end]) { // checking wheather asec or dsec right now it is asec
				return target < input[mid] ? (end = mid - 1) : (start = mid + 1);
			} else {
				return target < input[mid] ? (start = mid + 1) : (end = mid - 1);
			}

		}
		return -1;
	}

}
