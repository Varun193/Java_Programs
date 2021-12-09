package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,20,50,40,80));
		
		List<Integer> collect = arrayList.stream().filter(i -> i>40).collect(Collectors.toList());
		for (Integer integer : collect) {
			System.out.println(integer);
		}
		
		System.out.println("--------------");
		
		List<Integer> collect2 = arrayList.stream().map(i-> i +5).collect(Collectors.toList());
		for (Integer integer : collect2) {
			System.out.println(integer);
		}
		System.out.println("--------------");
		
		long count = arrayList.stream().filter(i -> i >20).count();
		System.out.println(count);
		
		System.out.println("--------------");
		
		//sorting ascending note: by default it will be ascending i1.compareTo(i2)
		List<Integer> AscSorted = arrayList.stream().sorted().collect(Collectors.toList());
		for (Integer integer : AscSorted) {
			System.out.println(integer);
		}
		
		System.out.println("--------------");
		
		//sorting dscending  (i1,i2)->i1<i2
		Comparator<Integer> c = (i1,i2)->i1<i2?+1:i1>i2?-1:0;
   	List<Integer> descSorted = arrayList.stream().sorted(c).collect(Collectors.toList());
	for (Integer integer : descSorted) {
		System.out.println(integer);
	}
		
	}

}
