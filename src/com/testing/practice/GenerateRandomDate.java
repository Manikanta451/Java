package com.testing.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GenerateRandomDate {
 
 
  
public static String generateRandomDate(String Format,String startDate,String endDate) throws ParseException
  {
   DateFormat formatter = new SimpleDateFormat(Format);
   Calendar cal=Calendar.getInstance();
   cal.setTime(formatter.parse(startDate));
   Long value1 = cal.getTimeInMillis();
   cal.setTime(formatter.parse(endDate));
   Long value2 = cal.getTimeInMillis();
   long value3 = (long)(value1 + Math.random()*(value2 - value1));
   cal.setTimeInMillis(value3);
   return formatter.format(cal.getTime());
     }
 
  
  
    public static void main(String args[]) throws ParseException{
     
     System.out.println(GenerateRandomDate.generateRandomDate("dd MMM yyyy", "01 Jan 2016", "01 Mar 2016"));
     
     
    }
  
  
  
  

}
