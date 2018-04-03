package com.java.date;

import java.time.LocalDate;  
public class LocalDateExample {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.now();  
    LocalDate yesterday = date.minusDays(1);  
    LocalDate tomorrow = yesterday.plusDays(2);  
    LocalDate dayafter =yesterday.plusDays(3);
    System.out.println("Today date: "+date);  
    System.out.println("Yesterday date: "+yesterday);  
    System.out.println("Tommorow date: "+tomorrow);  
    System.out.println("Dayaftertomorrow date:"+dayafter);
    
  }  
}  