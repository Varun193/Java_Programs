package com.practice.DSA;

public class NumberOccurance {

	public static void main(String[] args) {
		
		Integer num= 1223334455;
		int count=0;
		
	    while(num!=0) {
	    	int rem = num%10;  //5
	    	num=num/10;
	    	if(rem == 5) {
	    		count++;
	    		
	    	}
	    	
	    }System.out.println(count);
		

	}

}
