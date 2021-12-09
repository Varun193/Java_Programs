package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountWords {
	
	public static void main(String[] args) {
		int count = 0;
		List<String> list = new ArrayList<String>(Arrays.asList("Dell","Bangalore","odd","new"));
		for(String e :list) {
			String lc=e.toLowerCase();
			
		if(lc.charAt('d')) {
			System.out.println(lc);
			
		}
			
			
		}
	}

}
