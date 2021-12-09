package com.practice.dp;

public class AdapterDP {

	public static void main(String[] args) {
		
		Assignment as= new Assignment();
		as.doAssignment();
		

	}

}

class Assignment{
	
	 private Pen p= new PilotPen();
	
	public void setP(Pen p) {
		this.p = p;
	}

	public void doAssignment() {
		p.pen();
		System.out.println("i am tired of assignment");
	}
	
}

class PilotPen implements Pen{

	@Override
	public void pen() {
	  System.out.println("using pilot pen");
		
	}
	
	
}

interface Pen{
	
	void pen();
}