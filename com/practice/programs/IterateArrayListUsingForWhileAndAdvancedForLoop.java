package com.practice.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayListUsingForWhileAndAdvancedForLoop {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("1","2","va","ma","sa"));
		
		for(int i=0; i<arrayList.size()-1;i++) {
			System.out.println(arrayList.get(i));            //for
		}
		
		for(String s1: arrayList) {                         //advanced for
			System.out.println(s1);
		}
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {                           //while
			System.out.println(iterator.next());
		}
		
	}

}
