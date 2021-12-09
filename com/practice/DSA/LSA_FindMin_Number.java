package com.practice.DSA;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class LSA_FindMin_Number {

	public static void main(String[] args) {
		
		Integer input[]= {10,2,4,7,9,22,35,68,99};
		
		findMin(input);

	}
	
	static void findMin(Integer inp[]) {
		
	    //sol 1
		Arrays.sort(inp);
		System.out.println(inp[0]);
		
		//sol2
		
		
		Optional<Integer> findFirst = Stream.of(inp).sorted().findFirst();
		 System.out.println(findFirst);
		
		
	
	}

}
