package Exceptions;

import java.io.IOException;

public class ExceptionExample1 {
	public static void main(String[] args) {
		
		child c = new child();
		c.p1();
	}
	

}

class parent{
	
	public void p1() throws IOException {
	
	}
	
}

class child extends parent{
	
	@Override
	public void p1()   {
		System.out.println("child");
	}
	
}