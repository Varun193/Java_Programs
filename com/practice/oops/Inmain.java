package com.practice.oops;

public class Inmain {

	public static void main(String[] args) {
		
		InParent in = new InParent();
		in.name();
		
		Child c = new Child();
		c.name();
		
		InParent p = new Child();
		p.name();
		
		
		

	}

}
