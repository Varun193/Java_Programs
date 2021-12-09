package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArraylistExample {
	
public static void main (String args[]) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("megha");
	al.add("varun");
	al.add(null);
	al.add("manjula");//al.add(10);
// System.out.println(al);
// 
//   al.add(1, null);
//   System.out.println(al);
//   
//   System.out.println(al.get(2));
//   
//   ArrayList al2= new ArrayList();
//   al2.add("manjula");
//   
//   al.addAll(al2);
//   System.out.println(al);
//   
//   al.addAll(1, al2);
//   System.out.println(al);
//   
//   
//   al.remove(1);
//   System.out.println(al);
//   al.clear();
//   System.out.println(al);
 //  al.clone();
	for(int i=0;i<=al.size()-1;i++) {
		System.out.println(al.get(i));
	}
	System.out.println("--------------1");
   for(String e : al) {
	   System.out.println(e);
   }
   System.out.println("--------------2");
   al.stream().forEach(ve->System.out.println(ve));


System.out.println("--------------3");


ArrayList<String> al2= new ArrayList<String>(Arrays.asList("c","a","b"));
System.out.println(al2);
}
}
	


