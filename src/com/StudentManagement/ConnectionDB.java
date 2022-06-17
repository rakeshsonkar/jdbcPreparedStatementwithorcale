package com.StudentManagement;

import java.sql.*; 

public class ConnectionDB {
	static Connection con;
	  public static Connection createCon(){
		  try {
			  Class.forName("oracle.jdbc.driver.OracleDriver"); 
			  
			  String url="jdbc:oracle:thin:@localhost:1521:xe";
			  String databasename="ifms";
			  String password="ifms123";
			  con=DriverManager.getConnection(url, databasename, password);
		  }catch(Exception e){
			  System.out.println(e);
			  } 
		  return con;
	  }
	
}
