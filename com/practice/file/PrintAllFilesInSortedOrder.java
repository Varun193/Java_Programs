package com.practice.file;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class PrintAllFilesInSortedOrder {

	public static void main(String[] args) {
		
		 sortedFiles();
	}


	public static void sortedFiles() {
		
		File file = new File("C:\\");
		
		File[] allfiles = file.listFiles();
		
		//1
//		Arrays.sort(allfiles);
//		
//		for(File f: allfiles){
//			if(f.isFile()) {
//				System.out.println("file:"+f.getName());
//			}
//			else if(f.isDirectory()) {
//				System.out.println("directory:"+f.getName());
//			}
//			else {
//				System.out.println("unknown:"+ f.getName());
//			}
//		}
		
		//2
	       Stream.of(allfiles).sorted()
	       .forEach(f->{
	    	   if(f.isFile()) {
					System.out.println("file:"+f.getName());
				}
				else if(f.isDirectory()) {
					System.out.println("directory:"+f.getName());
				}
				else {
					System.out.println("unknown:"+ f.getName());
				}
	       });
		
		
	}

}
