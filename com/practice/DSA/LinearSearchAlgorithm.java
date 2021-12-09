package com.practice.DSA;

/*
 * search element in an array and return its index if searched element matches
 * with target element
 */

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		
		int [] input= {10,-2,-3,50,67,9};
		int target=10;      //element need to be serached if present in array or not
		
		int ans= searchElement(input,target);
		System.out.println(ans);

	}

	 static int searchElement(int input[], int target) {
		  
		 for(int i=0;i<input.length; i++) {
			 int element=input[i];
			 
			 if(element==target) {
				 return i;   //return index of element if target element is matched
				 //return input[i]; //return element at that particular index
			 }
			 
		 }return -1; //if element doesnot matches then return -1
		
	}
	

}
