package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {

	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}
	
	public String toString() {
		return id+" "+name;
	}
}

public class PredicateExample {

	public static void main(String[] args) {

		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(10, "lom"));
		al.add(new Emp(12, "tom"));
		al.add(new Emp(13, "mom"));
		al.add(new Emp(14, "som"));
		al.add(new Emp(15, "com"));
		Predicate <Emp> p=  s->s.id>13;
//		for(Emp e: al) {
//			if(p.test(e)) {
//			System.out.println(e);
//		}
			
			al.stream().filter(p).forEach(System.out::println);
		}

		//Predicate<Emp> p = e -> e.id >= 13 & e.name.startsWith("c");    //get all employess id >13

//		for (Emp e1 : al) {
//			if (p.test(e1)) { //test predicate  p for Emp
//				System.out.println(e1.id + " " + e1.name);
//			}
//		}
	}




