package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionExample {
	
   /*
    * interface BiFunction<T,U,R>{
    *      public R apply(T t, U u);
    * }
    */

	public static void main(String[] args) {
		  
		ArrayList<Employ> arrayList = new ArrayList<Employ>();
             BiFunction<Integer, String, Employ> fi = (eno,name) -> new Employ(eno , name);
             
             arrayList.add(fi.apply(10, "varun"));
             arrayList.add(fi.apply(20, "rakesh"));
             arrayList.add(fi.apply(30, "rahul"));
             arrayList.add(fi.apply(40, "syed"));
          
             
             for(Employ employ : arrayList) {
            	
            	System.out.println(employ.eno + " "+ employ.name);
             }
	}

}


class Employ{
	
	int eno;
	String name;
	
	Employ(int eno, String name){
		this.eno=eno;
		this.name=name;
	}
	
	
}