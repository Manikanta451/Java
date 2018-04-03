package com.testing.practicerealtimequestions;

import java.util.*;
import java.io.*;

public class Numberofwords {

    public static void main(String[]args) throws FileNotFoundException  {       
    
    	File file = new File("C://Users//Manikanta//Desktop//Docs//IWallThat.txt");
    	try(Scanner sc = new Scanner(new FileInputStream(file))){
    	    int count=0;
    	    while(sc.hasNext()){
    	        sc.next();
    	        count++;
    	    }
    	    
    	System.out.println("Number of words: " + count);
    	}
    	
    }
}