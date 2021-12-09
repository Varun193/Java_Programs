package com.practice.javaNewFeatures;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample2 {

	public static void main(String[] args) {

		Function<Student, String> f = s -> {

			String grade = "";
			if (s.marks >= 60)
				grade = "A";
			else if (s.marks >= 50)
				grade = "B";
			else if (s.marks >= 20)
				grade = "c";
			return grade;

		};
		
		Predicate<Student> p = s-> s.marks>50;

		Student[] ss = { new Student("varun", 40) , new Student("rakesh", 70), new Student("rahul", 90) };
		
		for (Student s1 : ss) {
			
			if(p.test(s1)) {
			System.out.println(s1.name + " " + f.apply(s1));
		}

	}
}
}

	class Student {

		String name;
		int marks;

		Student(String name, int marks) {

			this.name = name;
			this.marks = marks;

		}

	}

