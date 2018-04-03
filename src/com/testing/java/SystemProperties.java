package com.testing.java;

import java.util.*;


public class SystemProperties {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Properties p=System.getProperties();  
		Set set=p.entrySet();  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
		Map.Entry entry=(Map.Entry)itr.next();  
		System.out.println(entry.getKey()+" = "+entry.getValue());  
		}  

	}

}
