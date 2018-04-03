package com.testing.java;

class Instanceinitializerblock{  
    int speed;  
      
    Instanceinitializerblock(){
    	
    	System.out.println("speed is "+speed);
    	}  
   
    {speed=100;}  
      
    @SuppressWarnings("unused")
	public static void main(String args[]){  
    	Instanceinitializerblock b1=new Instanceinitializerblock();  
    	Instanceinitializerblock b2=new Instanceinitializerblock();  
    }      
}  