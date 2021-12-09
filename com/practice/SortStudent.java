package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortStudent {

	public static void main(String[] args) {
		
		

		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student("varun", "N", 101));
		al.add(new Student("rakesh", "s", 103));
		al.add(new Student("syed", "s", 102));
		al.add(new Student("aaa", "a", 99));
		al.add(new Student("varun", "s", 106));
		al.add(new Student("varun", "s", 10));

		Comparator<Student> ss = (o1, o2) -> {
			if (o1.fn.equals(o2.fn)) {
				if (o1.ln.equals(o2.ln)) {
					return o1.ssn - o2.ssn;
				}
			} else if (o1.fn.equals(o2.fn)) {
				return o1.ln.compareTo(o2.ln);
			}
			return o1.fn.compareTo(o2.fn);
		};

		// Collections.sort(al, new Student());

		// Collections.sort(al,ss);

		List<Student> collect = al.stream().sorted(ss).collect(Collectors.toList());

		System.out.println(collect);

		// System.out.println(al);

	}

}

class Student // implements Comparator<Student>
{

	String fn;
	String ln;
	int ssn;

	Student() {
		this.fn = fn;
		this.ln = ln;
		this.ssn = ssn;
	}

	Student(String fn, String ln, int ssn) {

		this.fn = fn;
		this.ln = ln;
		this.ssn = ssn;

	}

	public String toString() {
		return fn + ln + ssn;

	}
//
////	@Override
////	public int compareTo(Student o) {
////		
////		return this.ssn-o.ssn;
////	}
//
//	@Override
//	public int compare(Student o1, Student o2) {
//
//		if (o1.fn.equals(o2.fn)) {
//			if (o1.ln.equals(o2.ln)) {
//				return o1.ssn - o2.ssn;
//			}
//		} else if (o1.fn.equals(o2.fn)) {
//			return o1.ln.compareTo(o2.ln);
//		}
//			return o1.fn.compareTo(o2.fn);
//		
//		
//			 
//	
//
//	}
}
