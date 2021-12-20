package com.practice;

public class BasicSearchElement {

	public static void main(String[] args) {

		int input[] = { 2, 3, 4, 56, 89, 116 };
		int target = 56;

		System.out.println(findElement(input, target));

	}

	static int findElement(int input[], int target) {

		int start = 0;
		int end = input.length - 1;

	

	      while(start<=end) {
	    	  
	    		int mid = (start + end) / 2;
	    		
	    		if (target < input[mid]) {
	    			end = mid - 1;
	    		} 
	    		else if (target > input[mid]) {
	    			start = mid + 1;
	    		} 
	    		else {
	    			return mid;
	    		}
	    		
	      }
	      return -1;

	}
}
