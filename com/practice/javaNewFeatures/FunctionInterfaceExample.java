package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionInterfaceExample {

	/*
	 * interface Function<T,R>{
	 *  public R apply(T);
	 *   }
	 */

	public static void main(String[] args) {

//		Function<Integer, Integer> f = i -> i * i;
//
//		System.out.println(f.apply(4));
//		System.out.println(f.apply(5));
//		System.out.println(f.apply(6));
//		System.out.println(f.apply(7));
		
		Function<String,Integer> f = s->s.length();
        System.out.println( f.apply("varun"));
        System.out.println( f.apply("meghana"));
        System.out.println( f.apply("manjula"));
        System.out.println( f.apply("nagaraj"));
        
        System.out.println("------------");
		
        //Example 2
        
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("varun","narun    z","charan"));
        Function<String, Integer> ff= l->l.length();
        Function<String, Integer> fa= l->l.length()-1;
        
        for(String out:list) {
        System.out.println(ff.apply(out));
	}
        System.out.println("-------");
        
        list.stream().map(ff).forEach(System.out::println);
}
}
