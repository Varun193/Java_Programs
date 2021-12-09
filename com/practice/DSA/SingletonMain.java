package com.practice.DSA;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s1= Singleton.getInstance();
		System.out.println(s1);
		Singleton s2= Singleton.getInstance();
		System.out.println(s2);
		Singleton s3= Singleton.getInstance();
		System.out.println(s3);
		
		
		 
		
	}

}

class Singleton {

	private Singleton() {

	}
	
	private static Singleton instance;
	
    public static Singleton getInstance() {
    	
    	if(instance==null) {
    		instance=new Singleton();
    	}
    
		return instance;
    	
    	
    }
	
	
	
	

}
