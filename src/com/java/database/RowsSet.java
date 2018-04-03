package com.java.database;



import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  
  
public class RowsSet {  
        public static void main(String[] args) throws Exception {  
        	Class.forName("com.mysql.jdbc.Driver");   
      
    //Creating and Executing RowSet  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:mysql://localhost:3307/jdbcdatabase");    
        rowSet.setUsername("root");  
        rowSet.setPassword("root");  
        rowSet.setCommand("select * from emp");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getString(1));  
                        System.out.println("First Name: " + rowSet.getString(2));  
                        System.out.println("Last Name:: " + rowSet.getString(3));  
                        System.out.println("Age: " + rowSet.getInt(4));
                        System.out.println("Address: " + rowSet.getString(5));
                }  
                 
        }  
}  