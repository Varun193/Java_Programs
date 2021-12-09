package com.practice.DSA;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		/*
		 * Unlike if-then and if-then-else statements, the switch statement can have a
		 * number of possible execution paths. A switch works with the byte, short,
		 * char, and int primitive data types. It also works with enumerated types
		 * (discussed in Enum Types), the String class, and a few special classes that
		 * wrap certain primitive types: Character, Byte, Short, and Integer
		 */

		// switch(Expression){
		// case 1 : sysout();
		// break;
		// }
		System.out.println("Enter fruit name");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();

		switch (input) {

		case "mangao":
			System.out.println("mangao");
			break;
		case "apple":
			System.out.println("apple");
			break;
		case "banana":
			System.out.println("banana");
			
		  System.out.println("Enter size of banana");
		             String size = sc.nextLine().trim();
		             switch(size) {
		             
		             case "small": System.out.println("small");
		             break;
		             
		             case "large":System.out.println("large");
		             break;
		             
		             default:
		            	 System.out.println("invalid size");
		             
		             }
			break;
		default:
			System.out.println("invalid entry");

		}

		/*
		 * -> for case staements supported from java 14
		 */
		/*
		 * switch(input) {
		 * 
		 * case "manago"-> System.out.println("manago"); case
		 * "apple"->System.out.println("apple"); default:System.out.println("invalid");
		 * 
		 * }
		 */
	}

}
