package com.hrc.jdbc.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question4 {

	public static void main(String[] args) throws FileNotFoundException {

//		REGEX are
//
//		For invoice number [\d]{4}-[a-z]{3}-[\d]{2}\s+([\d\@\|\[\*]+)
//		For amount [\d]{4}-[a-z]{3}-[\d]{2}\s+[\d\@\|\[\*]+\s\S+\s[\d\.\,]+\s([\d\,\.]+)
//		All in one: [\d]{4}-[a-z]{3}-[\d]{2}\s+([\d\@\|\[\*]+)\s\S+\s[\d\.\,]+\s([\d\,\.]+)
		
		
		File inputFile = new File(System.getProperty("user.dir") + "\\src\\com\\hrc\\jdbc\\test\\RegexFile");
		
		Scanner fileInput = new Scanner(inputFile);
        List<String> wordList = new ArrayList<String>();
        String s = "";
        fileInput.nextLine();
        while (fileInput.hasNextLine()) {
        	wordList.add(fileInput.nextLine());
        	
        	
        }
        
//        for (String string : wordList) {
//			System.out.println(string);
//			
//		}
        System.out.println("Captured invoice number and payment amount(highlighted in yellow) are ");
        List<String> fl = new ArrayList<String>();
        List<String> fl1 = new ArrayList<String>();
        try {
        	for (String string : wordList) {
            	String str[] = string.split(" ");
            	
            	fl.add(getAns(str[1]));
            	fl1.add(getAns1(str[4]));
            	System.out.println(str[1]+"\t"+str[4]);
            	
            	str = null;
    		}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("\nAfter Normalizing .....");
			
			System.out.println("\nInvoice numbers  are");
			
			for (int i = 0; i < fl.size()-1; i++) {
				System.out.println(fl.get(i));
			}
			
			System.out.println("\n\nAmounts  are");
			
			for (String string : fl1) {
				System.out.println(string);
			}
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
//		System.out.println("s  ="+s);
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
//		System.out.println("s  ="+s);
		return s;
	}

	
}
