package com.java8.features;

import java.util.Optional;

public class WithOptionalClass {

	public static void main(String[] args) {
		String[] str = new String[10]; 
		Optional<String>checknull=Optional.ofNullable(str[5]);
		if (checknull.isPresent()){
			String lowercasestring=str[5].toLowerCase();
			System.out.println(lowercasestring);
		}else
			System.out.println("String value is not present");
		
	}

}
