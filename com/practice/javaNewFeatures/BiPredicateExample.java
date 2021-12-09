package com.practice.javaNewFeatures;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	/*
	 * interface BiPredicate<T,U>{
	 *     Boolean test(T t, U u);
	 * }
	 */

	public static void main(String[] args) {
		
	
		
		BiPredicate<Integer, Integer> bi = (a,b) -> (a+b) %2==0;
		
		System.out.println(bi.test(10, 20));
		

	}

}
