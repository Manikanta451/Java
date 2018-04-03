package com.testing.practice;

public class Class2 extends Class1 {
	
	
	Class2(){
		System.out.println("Class2 calss constructor in invoked");
	}
	
	
	public void testmethod3(){
		System.out.println("Test3 method ");
	}

	
	
	
	public static void main(String[] args) {
		
			Class2 test2=new Class2();
			test2.testmethod();
			test2.testmethod2();
			test2.testmethod3();
			

		}
	}

	


