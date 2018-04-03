package com.testing.practice;


import java.io.*;


	public class UpperCaseToLowerCase {

	public static void main(String[] args) throws IOException {

		
		String s ="aN ENHANCED GRID CURRENT";
		int i;
		char ch;
		for(i=0;i<s.length();i++)
		{
		ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		System.out.print(Character.toLowerCase(ch));
		else if(Character.isLowerCase(ch))
		System.out.print(Character.toUpperCase(ch));
		else
		System.out.print(ch);
		}
	}
	}
