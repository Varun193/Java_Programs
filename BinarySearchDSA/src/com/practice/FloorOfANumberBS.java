package com.practice;

public class FloorOfANumberBS {

	/*
	 * Floor of a number Floor = largest element in array smaller or less to target
	 * floor(arr,target=11) 11 is present so 11 is ans 
	 * ceiling(arr,target=45) 45 is not  present so we will return next largest element in array,
	 *                           so we return 13
	 *   
	 */

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 7, 11, 13, 45, 47, 67 };
		int target = 42;

		System.out.println(search(arr, target));

	}

	static int search(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while (start <= end) {

			mid = start + (end - start / 2);

			if (target == arr[mid])
				return arr[mid];

			if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return arr[end]; // return arr[end];

	}

}
