package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare2ArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("A","B","C","D"));
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("A","B","C","E"));
		
		// 1) Sort and Compare
		Collections.sort(ar1);
		Collections.sort(ar2);
       
		System.out.println(ar1.equals(ar2));
		
		//2)if you want find out which is different element from 2 list then
		
		ar1.removeAll(ar2);
		System.out.println(ar1);
		
	//	3)if you want find all common elements from both list then
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("A","B","C","D"));
		ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A","B","C","E"));
		
		ar3.retainAll(ar4);
		System.out.println(ar3);

	}

}
