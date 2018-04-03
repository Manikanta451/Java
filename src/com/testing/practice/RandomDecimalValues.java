package com.testing.practice;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomDecimalValues{
 
 //specific formats:
 //for two decimal values - #.##
 //for three decimal values - #.###
 //for four decimal values - #.####
 //for five decimal values - #.#####
 
 //Generating random decimal values with specific format
 public String generateDecimalData(String format,double min,double max) {
     //random double
     double out = min + new Random().nextDouble() * (max - min);
     DecimalFormat decimal = new DecimalFormat(format);
     return decimal.format(out);

  }
 
 //Usage
 public static void main(String[] args){
  
  RandomDecimalValues s = new RandomDecimalValues();
  System.out.println(s.generateDecimalData("#.#####",2.0d,9.0d));
  
 }



}
