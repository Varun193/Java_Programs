package com.practice.Parsing;

import java.time.Period;

public class PeriodParse {

	public static void main(String[] args) {
		
		String s= "P17Y9M5D";
		
		Period parse = Period.parse(s);
		System.out.println(parse);
		
		System.out.println(parse.getYears()+" "+"years");
		System.out.println(parse.getMonths()+" "+"months");
		System.out.println(parse.getDays()+" "+"days");

	}

}
