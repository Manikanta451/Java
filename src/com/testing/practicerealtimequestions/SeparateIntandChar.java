package com.testing.practicerealtimequestions;

public class SeparateIntandChar {

	public static void main(String[] args) {
		
		
		String str = "abcd123";
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++){
		if(Character.isDigit(ch[i])){
		System.out.print(ch[i]);
		    }
		}

	}

}
