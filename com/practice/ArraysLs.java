package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ArraysLs {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,40,70,80,32));
		 ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(12,22,32,42,72,82,30,40));
		al.add(90);
	   //	al.remove(100);
		for (Integer i : al) {
			System.out.println(i);
		}
		
//		al1.removeAll(al);
//		System.out.println("common elements removed are"+ al1); 
		
		al.retainAll(al1);
		System.out.println("retained elements from al are"+ al);
		
		System.out.println("--------------------");
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(15,20,50,70));
		ll.addFirst(19);
		ll.addLast(45);
		
		           Iterator<Integer> it=ll.iterator();
		           
		           while(it.hasNext()==true) {
		        	   System.out.println("Using iterator"+it.next());
		           }
		
	for (Integer integer : ll) {
		System.out.println(integer);
	}
	}

}
