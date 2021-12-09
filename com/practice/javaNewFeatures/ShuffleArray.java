package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ShuffleArray {

	public static void main(String[] args) {
		
		Integer [] ar= {1,2,3,4,5,6};
		
		List<Integer> l= Arrays.asList(ar);
		
		Collections.shuffle(l);
		
	        l.toArray(ar);
	        
	        System.out.println(Arrays.toString(ar));
		
	}

}
