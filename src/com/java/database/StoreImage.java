package com.java.database;


import java.sql.*;  
import java.io.*;  
public class StoreImage {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3307/jdbcdatabase","root","root");  

java.sql.PreparedStatement ps=con.prepareStatement("insert into storeimages values(?,?)");  
ps.setString(1,"sonoo");  
  
FileInputStream fin=new FileInputStream("C:\\Users\\Manikanta\\Desktop\\Yapyzal\\TIMELINE.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}  