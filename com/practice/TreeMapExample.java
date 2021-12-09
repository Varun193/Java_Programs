package com.practice;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("varun", 100);
		treeMap.put("rakesh", 101);
		treeMap.put("syed", 102);
		treeMap.put("rahul", 104);
		
		System.out.println(treeMap);
		
		for (Entry<String, Integer> s: treeMap.entrySet()) {
			System.out.println(s);
		}
		
		treeMap.forEach((k,v)->System.out.println(k+" "+v));
		
		
         //to get values in reverse order
		TreeMap<String,Integer> treeMap1 = new TreeMap<String, Integer>(Comparator.reverseOrder());
		treeMap1.put("varun", 100);
		treeMap1.put("rakesh", 101);
		treeMap1.put("syed", 102);
		treeMap1.put("rahul", 104);
		
		System.out.println("----------");
		
		treeMap1.forEach((k,v)->System.out.println(k+" "+v));
		
		

	}

}
