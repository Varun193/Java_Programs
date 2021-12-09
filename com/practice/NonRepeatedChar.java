package com.practice;

import java.util.HashMap;

public class NonRepeatedChar {





	public static void main(String[] args) {
	
		String s= "abcccddeef";
		
		
		char cs;
		
		String value;
		
		
	    HashMap<Character,String> hashMap = new HashMap<Character,String>();
	    
	    for(int i=0; i< s.length()-1;i++) {
	    	cs= s.charAt(i);
	    	if(hashMap.containsKey(cs)){
	    		 value = hashMap.get(cs);
	    		 
	    		System.out.println(value);
	    	}else {
	    		System.out.println("--------");
	    	}
	    }
		

	}

}
