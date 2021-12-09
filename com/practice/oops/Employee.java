package com.practice.oops;

public interface Employee {
	
	public void id();
	public void name();
	
	static void number() {
		System.out.println("12345");
	}
	
	default void address() {
		System.out.println("kkolar");
	}

}
