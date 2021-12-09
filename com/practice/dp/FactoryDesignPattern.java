package com.practice.dp;

public class FactoryDesignPattern {

	public static void main(String[] args) {

		FactorySystemProvider fsp = new FactorySystemProvider();
		Os obj = fsp.provider("windows");
		obj.os();

	}

}

interface Os {

	public void os();
}

class Windows implements Os {

	public void os() {
		System.out.println("windows os");
	}
}

class Andriod implements Os {

	public void os() {
		System.out.println("Android os");
	}
}

class FactorySystemProvider {

	public Os provider(String name) {
		if (name.equals("windows")) {
			return new Windows();
		}
		return new Andriod();

	}
}
