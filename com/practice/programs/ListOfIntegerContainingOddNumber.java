package com.practice.programs;

import java.util.ArrayList;
import java.util.Iterator;


public class ListOfIntegerContainingOddNumber {

	public static void main(String[] args) {
		ArrayList<Integer> li= new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(23);
		
		Iterator<Integer> iterator = li.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		for(int i : li) {
			if(i%2==0) {
				
				System.out.println(i);
				
			}
		}
	}
	
	
}
