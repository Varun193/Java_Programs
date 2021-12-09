package com.practice.DSA;



public class InnerClasses {

	// Inner classes will be dependent on outside class,
	static class Student {
		 String name;

		Student(String name) {
			this.name = name;
		}
	}
	

	public static void main(String[] args) {
         
		//Without making Inner class as static we cannot access because it is dependent
		//on outside class instance
		//Note: If you make inner class as static then it will become class level variable
		 Student s = new Student("varun");
		 System.out.println(s.name);
	}

}
