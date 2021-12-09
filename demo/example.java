package demo;

import java.util.ArrayList;
import java.util.Arrays;

public class example {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3,5,7,8));
		
		arrayList.stream().forEach(e->System.out.print(e));
		
		//arrayList.stream().map(e->)
		
	}

}
