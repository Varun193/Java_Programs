package com.practice.oops;

public class EnCapsulation {
	
	  int id = 10;
	
	public void getid() {
		System.out.println(id);
	}

}

class Hack{
	
	public static void main(String[] args) {
		EnCapsulation enCapsulation = new EnCapsulation();
		enCapsulation.id=20;
	}
}