package com.testing.java;

public class Instanceinitializerblock2 {
		Instanceinitializerblock2(){  
		System.out.println("parent class constructor invoked");  
	}  
}  
class B2 extends Instanceinitializerblock2{  
B2(){  
super();  
System.out.println("child class constructor invoked");  
}  
  
{System.out.println("instance initializer block is invoked");}  
@SuppressWarnings("unused")
public static void main(String args[]){  
B2 b=new B2();  

}  
}  