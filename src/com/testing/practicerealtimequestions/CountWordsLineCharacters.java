package com.testing.practicerealtimequestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 

 
public class CountWordsLineCharacters {
	
	public static void main(String[] args) {
		try {
			String File = "C://Users//Manikanta//Desktop//Docs//IWallThat.txt";
			readFileAndPrintCounts(File);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
 
	public static void readFileAndPrintCounts(String File) throws FileNotFoundException {
 
		int TotalWords = 0;
		int TotalLines = 0;
		int TotalCharacters = 0;
		String Line;

		try (BufferedReader Buffer = new BufferedReader(new FileReader(File))) {
			
			// read each line one by one
			while ((Line = Buffer.readLine()) != null) {
				
					TotalLines++;
 
				// ignore multiple white spaces
				String[] myWords = Line.replaceAll("\\s+", " ").split(" ");
 
				for (String s : myWords) {
					TotalCharacters += s.length();
				}
 
				TotalWords += myWords.length;
 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("* Total Characters: " + TotalCharacters);
		System.out.println("* Total Words " + TotalWords);
		System.out.println("* Toal Lines: " + TotalLines);
		
	}
 
	
	
}
