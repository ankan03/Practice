package com.hrc.jdbc.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question4Trial {
	public static String readFileAsString(String fileName)throws Exception 
	  { 
	    String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data; 
	  } 
	  
	public static void main(String[] args) throws Exception {
		List<String> invoiceList = new ArrayList<String>();
		List<String> priceList = new ArrayList<String>();
		
		List<String> finalInvoiceList = new ArrayList<String>();
		List<String> finalPriceList = new ArrayList<String>();
		
		Pattern p1=Pattern.compile("[\\d]{4}-[a-z]{3}-[\\d]{2}\\s+([\\d\\@\\|\\[\\*]+)\\s\\S+\\s[\\d\\.\\,]+\\s([\\d\\,\\.]+)");
		String data = readFileAsString("C:\\Users\\ankan.mukherjee\\Downloads\\RegexFile");
		Matcher m1=p1.matcher(data);
		while(m1.find()) {
			invoiceList.add(m1.group(1));
			priceList.add(m1.group(2));
			}
		
		System.out.println("\nInvoice List before NORMALIZATION");
		for (String string : invoiceList) {
			System.out.println(string);
			finalInvoiceList.add(getAns(string));
		}
		
		System.out.println("\nPrice List before NORMALIZATION");
		for (String string : priceList) {
			System.out.println(string);
			finalPriceList.add(getAns1(string));
		}
		
		System.out.println("\nInvoice List After NORMALIZATION");
		for (String string : finalInvoiceList) {
			System.out.println(string);
		}
		
		System.out.println("\nPrice List After NORMALIZATION");
		for (String string : finalPriceList) {
			System.out.println(string);
		}
	}
	
	private static String getAns(String string) {
		String s = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(ch >= '0' && ch <= '9') {
				s+=ch;
			}
			
		}
		return s;
	}
	
	private static String getAns1(String string) {
		String s = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(ch >= '0' && ch <= '9' || ch=='.') {
				s+=ch;
			}
			
		}
		return s;
	}
}
