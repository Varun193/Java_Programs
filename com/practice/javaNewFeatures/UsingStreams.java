package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreams {
	
	public static void main(String[] args) {
		
			
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(50,20,30,70,90,35));
		arrayList.stream().forEach(e->System.out.println(" the numbers are " + e));
		
		//convert to map if we want to perform some operation .ie, add, sub etc we can use map ie to do some opertiona and return some result
		
		List<Integer> collect = arrayList.stream().map(e->e+5).collect(Collectors.toList());
		System.out.println(collect);
		
		//show students marks greater than 35
		long it = arrayList.stream().filter(e->e>=35).count();
		System.out.println(it);
		
		//comparator (i,i2)->i1<i2?-1:i1>i2?+1:0 /(i1,i2)->i1<i2?-1:i1>i2?+1:0
		//by default sorted method will be in ascending order
		List<Integer> asc = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		//sorting in descending order
		
		List<Integer> dsc = arrayList.stream().sorted((i1,i2)->i1>i2?-1:i1>i2?+1:0).collect(Collectors.toList());
		System.out.println(dsc);
		
	
		
		
	}

}
