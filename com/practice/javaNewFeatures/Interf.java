package com.practice.javaNewFeatures;
@FunctionalInterface
public interface Interf {
	
	//public void m1(int a, int b);
	
	public int m1(int n);
	
	static void m2() {
		System.out.println("static method");
	}
	
	default void m3() {
		System.out.println("Default method");
	}

}
