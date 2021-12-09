package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
	
	public static void main(String args[]) {
		
		     List<Student> l= new ArrayList<>(Arrays.asList(new Student("varun")));
		     List<Person> l1= new ArrayList<>(Arrays.asList(new Person("varun")));
	}
	
	
	        

}


class Student{
	
	String name;
	
	Student(String name){
		this.name=name;
}
}

class Person{
	
	String name;
	
	Person(String name){
		this.name=name;
}
	
}