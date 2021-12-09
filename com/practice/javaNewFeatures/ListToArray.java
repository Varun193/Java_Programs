package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ListToArray {

	public static void main(String[] args) {

          ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(10,20,30,50,60));
         
           Integer[] ii=al.stream().toArray(Integer[]::new);
             
//             for(int i=0; i<ii.length; i++) {
//            	 System.out.println(ii[i]);
//             }
             
//             for (Integer integer : ii) {
//				System.out.println(integer);
//			}
//             
   //to apply stream concept to Arrays we need to convert our array to stream
   //Stream.of(ii) convert arrays to streams then we can apply streams concept
           
             Stream.of(ii).forEach(System.out::println);
          
          

	}

}
