package com.hrc.jdbc.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputFile = new File(System.getProperty("user.dir") + "\\src\\com\\hrc\\jdbc\\test\\input.txt");
		File outputFile = new File(System.getProperty("user.dir") + "\\src\\com\\hrc\\jdbc\\test\\output.txt");
        Scanner fileInput = new Scanner(inputFile);
        List<String> wordList = new ArrayList<String>();
        while (fileInput.hasNextLine()) {
        	wordList.add(fileInput.nextLine());
        }
        
        
        Set<String> outputWordList = new TreeSet();
        for (String string : wordList) {
			outputWordList.add(string.toLowerCase());
		}
        
        
        for (String string : outputWordList) {
			System.out.println(string);
		}
        
        
        
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String string : outputWordList) {
            bufferedWriter.write(string.toLowerCase());
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        System.out.println("Successfully written to the file");
	}

}
