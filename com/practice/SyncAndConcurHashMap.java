
package com.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SyncAndConcurHashMap {

	public static void main(String[] args) {
		//1) creating synchronized map
		Map<String,String> map = new HashMap<>();
		map.put("varun","101");
		map.put("virat", "102");
		
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
		System.out.println(synchronizedMap);
		
		//2)Conncurrent hashmap
		
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();
		chm.put("tom", "110");
		chm.put("jerry", "111");
		
		System.out.println(chm);
        
	}

}
