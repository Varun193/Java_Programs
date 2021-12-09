package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String args[]) {

	  ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,4,5,5));
	  System.out.println(numbers);
	  
	  //using linked hash set
	  LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>(numbers);
	  System.out.println(lh);
	  //after jdk 8 using streams lambda expressions
	  
	 List<Integer> uniqueNumbers= numbers.stream().distinct().collect(Collectors.toList());
	 System.out.println(uniqueNumbers);
	  
	  
	  
}
}