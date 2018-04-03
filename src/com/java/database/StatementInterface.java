package com.java.database;


import java.sql.*;  
class StatementInterface{  
public static void main(String args[])throws Exception{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdatabase","root","root");  
Statement stmt=con.createStatement();  
  
//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
int result=stmt.executeUpdate("delete from emp where id=1");  
System.out.println(result+" records affected");  
con.close();  
}}  