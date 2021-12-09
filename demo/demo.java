package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
	int id;
	String name;
	float price;

	demo(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public static void main(String[] args) {
        
		  ArrayList<demo> al = new ArrayList<demo>();
		  al.add(new demo(10,"varun",100));
		  al.add(new demo(11,"narun",200));
		  al.add(new demo(12,"carun",300));
		  al.add(new demo(13,"yarun",400));
		  al.add(new demo(14,"zarun",500));
		  
		  
		  List<demo> collect = al.stream().filter(demo-> demo.price>300).collect(Collectors.toList());
		  for(demo d:collect) {
			  System.out.println(d.price+ " "+d.id+" "+d.name);
			  
		  }
		  
	}
	
	  
	

}
