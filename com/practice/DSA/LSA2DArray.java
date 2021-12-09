package com.practice.DSA;

import java.util.Arrays;

/*
 * Search element in 2d array and returns its index
 */

public class LSA2DArray {

	public static void main(String[] args) {

		int input[][] =new int[][] { 
				{ 1, 5, 7 }, 
				{ 22, 6 }, 
				{ 32, 67, 89 } 
				};

		int target = 89; // element need to be searched

		int[] search = search(input, target);
		String ans = Arrays.toString(search);
		System.out.println(ans);
		
		

	}
	
	static int[] search(int input [][], int target) {
	
		  for(int row=0; row<input.length; row++ ) {
			  for(int col=0; col<input[row].length; col++) {
				   
				 return new int[] {row,col};
			  }
		  }
		return new int[]{-1,-1};
	}

}
