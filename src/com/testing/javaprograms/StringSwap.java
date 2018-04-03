package com.testing.javaprograms;

import java.util.Scanner;

public class StringSwap{
	
		public static void main(String[] args){

					Scanner s1=new Scanner(System.in);
					Scanner s2=new Scanner(System.in);
					System.out.println("Enter the first string");
					String a1=s1.nextLine();
					System.out.println("Enter the second string");
					String a2=s2.nextLine();
					System.out.println("Before Swap");
					System.out.println(a1);
					System.out.println(a2);
					System.out.println("After Swap");
					a1=a1+a2;
					a2=a1.substring(0,6);
					a1=a1.substring(6);
					System.out.println(a1);
					System.out.println(a2);
					s1.close();
					s2.close();
					}
					}
