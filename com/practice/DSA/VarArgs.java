package com.practice.DSA;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		
		fun(10,20,30);
		fun("varun","meghana");
		fun(11,22,"abc","def");

	}

	 static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
		
	}
	 
	 static void fun(String ...v) {
		 System.out.println(Arrays.toString(v));
	 }
	 
	 static void fun(int a,int b,String...v) {
		 System.out.println(a+" "+b+Arrays.toString(v));
		 
	 }

}
