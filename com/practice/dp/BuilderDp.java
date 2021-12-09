package com.practice.dp;

public class BuilderDp {

	public static void main(String[] args) {
		
		Phone p = new Phone("iphone", 12, 6, 3000);
		System.out.println(p);
		
		BuilderPhone bp= new BuilderPhone().pName("iphone").pBattery(3000);
		System.out.println(bp);
		
		
		

	}

}

class Phone {

	String pname;
	int size;
	long ram;
	double battery;
	//String Processor is introduced at that time we need to change constuctor as well
//as well some people will be interested in pname and size but if we use this
	//approach we are forcing user to enter details of all fields which is not good approach
	//in order to avoid that we can use builder DP
	public Phone(String pname, int size, long ram, double battery) {
		
		this.pname = pname;
		
		this.size = size;
		this.ram = ram;
		this.battery = battery;
	}
	
	public String toString() {
		return "pname is "+pname+" size is "+size+" ram is "+ram+" battery is "+battery;
	}
}

class BuilderPhone{
	
	String pname;
	int size;
	long ram;
	double battery;
	
	public BuilderPhone pName(String pname) {
		this.pname=pname;
		return this;
	}
	
	public BuilderPhone pSize(int size) {
		this.size=size;
		return this;
	}
	
	public BuilderPhone pRam(long ram) {
		this.ram=ram;
		return this;
	}
	
	public BuilderPhone pBattery(double battery) {
		this.battery=battery;
		return this;
	}
	
	public BuilderPhone phone(String pname, int size, long ram, double battery) {
		
		this.pname = pname;
		this.size = size;
		this.ram = ram;
		this.battery = battery;
		return this;
	}
	
	public String toString() {
		return "pname is "+pname+" size is "+size+" ram is "+ram+" battery is "+battery;
	}
	
	
}