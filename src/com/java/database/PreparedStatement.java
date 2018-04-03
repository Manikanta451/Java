package com.java.database;


import java.sql.*;  
class PreparedStatement{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdatabase","root","root");  
  
PreparedStatement stmt=(PreparedStatement) con.prepareStatement("insert into emp values(?,?)");  
((java.sql.PreparedStatement) stmt).setInt(1,101);//1 specifies the first parameter in the query  
((java.sql.PreparedStatement) stmt).setString(2,"Ratan");  
  
int i=((java.sql.PreparedStatement) stmt).executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  