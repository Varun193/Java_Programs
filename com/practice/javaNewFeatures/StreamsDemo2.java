package com.practice.javaNewFeatures;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo2 {

	public static void main(String[] args) throws Exception {
		
		//reading from each row of a file
		//Files.line will give group of strings present 
		
		Stream<String> lines = Files.lines(Paths.get("C:\\testing\\test.txt"));
		List<String> collect = lines.filter(s->s.length()>3).sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);
		lines.close();  //close stream connection in order to avoid memory leaks
		
		System.out.println("-----------------------------------------------");
		
		//reading from csv file and remove row which doesn't have values
		
		Stream<String> lines2 = Files.lines(Paths.get("c:\\testing\\csvfile.txt"));
		 long count = lines2
		.map(x->x.split(","))
		.filter(x->x.length==5)
		.count();
		 lines2.close();
		 System.out.println(count);
		 
		 
		 System.out.println("---reading from csv file and getting particular data");
		 
		 Stream<String> lines3 = Files.lines(Paths.get("c:\\testing\\csvfile.txt")); 
		lines3
		 .map(x->x.split(","))
		 .filter(x->x.length>3)
		 .filter(x-> Integer.parseInt(x[1])>11)
		 .forEach(x-> System.out.println(x[0] +" "+x[1]+" "+x[2]));
		 lines3.close();
		 
		 System.out.println("---reading from csv file and storing it in map");
		 
		 Stream<String> lines4 = Files.lines(Paths.get("c:\\testing\\csvfile.txt")); 
		 Map<String,Integer> map = lines4
		 .map(x->x.split(","))
		 .filter(x->x.length>1)
		 .filter(x-> Integer.parseInt(x[1])>10)
		 .collect(
				 Collectors
				 .toMap(
						 x->x[0],
						 x->Integer.parseInt(x[1]))
				 );
		 lines4.close();
		 
		 for(String key: map.keySet()) {
			 System.out.println("key is "+key+" and value is "+map.get(key));
		 }
		 
		 System.out.println("--------------------");
		 
		 //Reduction - sum
		                       // a will be ruuning element and b will be target element, 
		                       //first a will be 0 and b will take 1st value from stream
		 Integer reduce = Stream.of(1,3,5,6,8).reduce(0, (Integer a,Integer b)->(a+b));
		System.out.println(reduce);
		
		 System.out.println("--------------------");
		
		//Reduction- summary statictics (applicable only for intStream)- gives sum ,avg,total,count,max as result
		
		IntSummaryStatistics summaryStatistics = IntStream.of(10,20,30,40,50).summaryStatistics();
		System.out.println(summaryStatistics);
		 
		
		 
		 
		 
		
	
		
		

	}


}
