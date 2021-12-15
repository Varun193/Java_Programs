package com.practice.DSA;

public class LSA2DArrayFindMax {

	public static void main(String[] args) {
		
		int [][] input= new int[][] {
			{5,3,7},
			{21,45,76},
			{2974,82,74}
		};
		
	 int ans = findMax(input);
	 System.out.println(ans);
	 

	}

	 static int findMax(int[][] input) {
		int  max=Integer.MIN_VALUE;
		 for(int arr[]:input) {
			 for(int ele:arr) {
				 if(ele>max) {
					  max=ele;
				 }
			 }
		 }
		 
		 
		 
		return max;
		
	}
	

}


