package com.practice.DSA;

public class LSAMaxCustomerWealth {

	public static void main(String[] args) {

		// 3+2+1=6 8+2+6=16, 16 is highest return 16

		int[][] input = new int[][] { { 3, 2, 1 }, { 8, 2, 6 } };

		result(input);
	}

	static void result(int[][] inp) {

		int max = Integer.MIN_VALUE;

		for (int ele[] : inp) {
			int rowSum = 0;

			for (int arr : ele) {
				rowSum += arr;
			}

			if (rowSum > max) {
				max = rowSum;
			}

		}
		System.out.println("richest customer"+" "+max);
	}

}
