package com.java.database;

import java.sql.*;  

class ResultSetMetaData{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdatabase","root","root");  
 

PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from emp");  
ResultSet rs=((java.sql.PreparedStatement) ps).executeQuery();  
java.sql.ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(2)); 
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(3)); 
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(4)); 
System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(5)); 
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  