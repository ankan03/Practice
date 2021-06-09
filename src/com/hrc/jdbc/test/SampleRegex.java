package com.hrc.jdbc.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleRegex {
//	public static void main(String[] args) {
//		
//	}
	
	public static String readFileAsString(String fileName)throws Exception 
	  { 
	    String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data; 
	  } 
	  
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Pattern p1=Pattern.compile("<[^>]+>[^>]+<[^>]+>[^<]+<[^>]+><[^>]+><[^>]+>([^<]+)<[^>]+><[^>]+><[^>]+>[^<]+<[^>]+><[^>]+>([^<]+)<[^>]+><[^>]+>([^<]+)<[^>]+><[^>]+>([^<]+)<[^>]+><[^>]+>([^<]+)");

		String data = readFileAsString("C:\\Users\\ankan.mukherjee\\Downloads\\NextPageHTML.txt");
	    
		Matcher m1=p1.matcher(data);
		while(m1.find()) {
			System.out.println("MATCH IN");
			System.out.println("Invoice number is "+m1.group(1));
			System.out.print("Date is "+m1.group(2));
			System.out.print(" and Amount is "+m1.group(3));
			System.out.println(" MATCH OUT"); 

			}
	
	}
}
