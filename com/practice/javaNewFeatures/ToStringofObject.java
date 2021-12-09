package com.practice.javaNewFeatures;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	int id;
	String name;
	
	public Employee(String name, int id) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.name=name;
	}
}

//int Comparator(obj o1, obj o2){compare()}

//(e1,e2)->{return e1<e2?-1:e1>e2?+1:0 }


public class ToStringofObject {
	public static void main(String[] args) {
//		Employee e = new Employee(10,"varun");
//		System.out.println(e);
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee("varun",10));
		al.add(new Employee("rakesh",11));
		al.add(new Employee("tom",12));
		al.add(new Employee("mom",13));
		System.out.println(al.get(1));
		Collections.sort(al,(e1,e2)-> e1.name.compareTo(e2.name));
		System.out.println(al);
	}

}
