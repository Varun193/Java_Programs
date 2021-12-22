package com.practice;

public class CeilingBS {
	
	/*
	 * Ceiling of a number 
	 * ceiling = smallest element in array greater or equal to target
	 * ex:ceiling(arr,target=11) 11 is present so 11is ans
	 *    ceiling(arr,target=12) 12 is not present so we will return next smallest element in array
	 */

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,7,11,13,45,47,67};
		int target=42;
		
		System.out.println(search(arr,target));

	}
            
	static int search(int arr[], int target) {
		
		int start=0;
		int end=arr.length-1;
		int mid = 0;
		while(start<=end) {
			
			 mid=start+(end-start/2);
			
			if(target==arr[mid]) return arr[mid];
			
			if(target<arr[mid]){
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return arr[mid+1]; //return arr[mid];
	}
}
