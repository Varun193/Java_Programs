package com.practice.javaNewFeatures;

import java.util.function.Predicate;

public class CombiningTwoPredicatesToCheckComplexConditions {

	public static void main(String[] args) {

		int[] x = { 5, 10, 15, 20, 25, 30, 35, 40 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;

		for (int x1 : x) {
//			if (p1.or(p2).test(x1)) {
//				System.out.println(x1);
//			}
//			if (p1.and(p2).test(x1)) {
//				System.out.println(x1);
//			}
			 
				if(p1.negate().test(x1)){
					System.out.println(x1);
				}
			}
		}

	}


