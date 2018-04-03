package com.testing.java;

public class Instanceinitializerblock1 {

    int speed;  
      
    Instanceinitializerblock1(){
    	System.out.println("constructor is invoked");
    	}  
   
    {System.out.println("instance initializer block invoked");}  
    @SuppressWarnings("unused")   
    public static void main(String args[]){  
    	Instanceinitializerblock1 b1=new Instanceinitializerblock1();  
    	Instanceinitializerblock1 b2=new Instanceinitializerblock1();  
    }      
}  