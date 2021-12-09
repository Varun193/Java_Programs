package com.practice.programs;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		//0,1,1,2,3,5,8,13
		
	//0+0,0+1,1+1,2+1,3+2,5+3
		
		int count =5,n1=0,n2=1,n3;
		int result=0;
		System.out.println(n1+ " "+ n2);
		for(int i =1; i<=count; i++ ) {
			
			result=n1+n2;
			System.out.println(result);
			n1=n2;
			n2=result;
		}
		
		
		
	}
}





