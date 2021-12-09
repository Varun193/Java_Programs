package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLisExample {

	public static void main(String args[]) {

		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<String> ar1 = new ArrayList<>(Arrays.asList("20", "30"));

		ar.add(10);
		System.out.println(ar.size());

		Object clone = ar.clone();
		System.out.println(clone);

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}

		for (String i : ar1) {
			System.out.println(i);
		}

		Iterator<String> iterator = ar1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
