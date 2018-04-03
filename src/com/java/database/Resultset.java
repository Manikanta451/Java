package com.java.database;


import java.sql.*;  
class Resultset{  
	public static void main(String args[])throws Exception{  
  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbcdatabase","root","root");  
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		//getting the record of 3rd row  
		rs.absolute(3);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ "  "+rs.getInt(4)+" "+rs.getString(5));  
  
		con.close();  
}}  