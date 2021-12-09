package com.practice.DSA;

public class Scope {
	
	/*
	 * Anthing initilized inside block can be reinitilized but cannot used outside block
	 *  Anthing initilized outside block cannot be reinitilized but can used inside   inside block
	 */

	/*
	 * outisde block
	 */
	public static void main(String[] args) {
		
		int a = 10;
		int b=20;
		String name="varun";
		sum(a,b);
		
		/*
		 * inside block
		 */
		{ 
			int c=20;
			name="meghana";
		 a = 20;
			
		} 
		int c=30;
		System.out.println("--"+c);
		
		/*
		 * for block
		 */
		for(int i=0;i<10;i++) {
		System.out.println(i);
		
			
		}   
		
		System.out.println(name);

	}
	


	
	       static void sum(int num1, int num2) {
	    	 
	    	 int  b=num1;
	    	 int   a=num2;
	    	 
	    	 System.out.println(a + "  " + b);
	    	 
	    	 
	     }
}
