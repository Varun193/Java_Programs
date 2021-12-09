package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		 //Integer Stream
		  IntStream.range(1, 10).forEach(System.out::print); 
		  
		  //Integer stream with skip
		  System.out.println("-------------");
		  
		  IntStream.range(1, 10).skip(5).forEach(System.out::println);
		 
		  System.out.println("-------------");
		  
		  //sum of integer streams
		  
	System.out.println(	  IntStream.range(1, 10).sum());
	
	  System.out.println("-------------");
	  
	
	  List<String> l= Stream.of("varun","rakesh","aaa","syed")
			  .sorted().collect(Collectors.toList());
	  l.stream().forEach(System.out::println);
		  
	  System.out.println("-------------");
		  
 Stream.of("varun","rakesh","aaa","syed").sorted().findFirst().ifPresent(System.out::println);
 
 System.out.println("-------------");
 
 // from string array filter,sortand collect
 String [] s= {"varun","tttt","aseew","fjkfj"};
 
 List<String> collect = Stream.of(s).filter(s1->s1.contains("a")).sorted().collect(Collectors.toList());
 collect.stream().forEach(System.out::println);
 
 System.out.println("-------------");
 
 //stream with integer
 List<Integer> res = Stream.of(new Integer[] {2,3,5,6,7,8}).map(i->i*2).collect(Collectors.toList());
 res.stream().forEach(System.out::println);
 
 System.out.println("-------------");
 
 //Convert to lower Case
 
 ArrayList<String> list = new ArrayList<String>(Arrays.asList("VA","AAA","BBB","CCC"));
 List<String> ll = list.stream().map(lw->lw.toLowerCase()).collect(Collectors.toList());
 
 ll.stream().forEach(System.out::println);
 
	
	
	}	
}
