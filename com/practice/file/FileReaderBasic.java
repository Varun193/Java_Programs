package com.practice.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReaderBasic {
	
	/*
	 * copy data from one file other in the same folder location
	 */

	public static void main(String[] args){

		File inputfile = new File("C:\\testing\\test.txt");
		File outputfile= new File("C:\\testing\\outputtest.txt");
     
		 FileInputStream fileInputStream=null;
		 FileOutputStream fileOutputStream =null;
		 
		      
		 try {
			fileInputStream= new FileInputStream(inputfile);
			fileOutputStream= new FileOutputStream(outputfile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			 try {
				int num =0;// fileInputStream.read() =read will check for how much bytes of data is present
				while((num =fileInputStream.read())!=-1) {
					fileOutputStream.write(num);
				}
					
					
				}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 finally {
				 try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
		 
		 
		 
//		 if(inputfile.exists()) {
//			 try {
//			 fileInputStream = new FileInputStream(inputfile);
//			 }catch(FileNotFoundException fe) {
//				 fe.printStackTrace();
//			 }
//		 }
//		 try {
//		int num=fileInputStream.read();
//		while(num!=-1) {
//			fileOutputStream=new FileOutputStream(inputfile);
//		}
//		 }catch (IOException io) {
//			io.getMessage();
//		}
//	    
     
	}



