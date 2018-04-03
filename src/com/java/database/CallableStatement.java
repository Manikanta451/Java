package com.java.database;


import java.sql.*;  
public class CallableStatement {  
public static void main(String[] args) throws Exception{  
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdatabase","root","root");   

  
java.sql.CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
stmt.setInt(1,1011);  
stmt.setString(2,"Amit");  
stmt.execute();  
  
System.out.println("success");  
}  
}  