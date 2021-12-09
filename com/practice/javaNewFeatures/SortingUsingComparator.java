package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingUsingComparator {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(0);
		System.out.println(al);
	 Comparator<Integer> c=  (o1,o2)-> o1<o2?-1:o1>o2?+1:0;
	 Collections.sort(al,c);
	 System.out.println(al);
		
	}

}
