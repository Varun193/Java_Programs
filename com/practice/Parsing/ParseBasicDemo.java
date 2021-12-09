package com.practice.Parsing;

public class ParseBasicDemo {

	public static void main(String[] args) throws OwnException{
		
		/*Java parseInt () method is used to get the primitive data type from a 
		 * specific string. In other words it converts a string to a number. 
		 * parseInt () can have one or two arguments.
		 * Syntax:
		 * static int parseInt(String s)
           static int parseInt(String s, int radix)
           
           Where s is the string representing a signed decimal value and 
           radix the base of a numerical system. 
           Keep in mind that there’s no default base value — you need to enter
            one within the range of 2 and 36. 
		 */
		
		String s1= "123";
		String s2="456abc";
		
	          System.out.println(Integer.parseInt(s1));
	          System.out.println(Double.parseDouble(s1));
	         // System.out.println(Double.parseDouble(s2));
	          
	          System.out.println("----------------");
	          
	          int x= Integer.parseInt("12");
	          System.out.println(x);
	          
	          int y = Integer.parseInt("101",8);
	          System.out.println(y);
	          
	         

	}
	

}
class OwnException extends Throwable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void raiseException(String msg) {
		System.out.println("In String characters/word is present");
	}
}
