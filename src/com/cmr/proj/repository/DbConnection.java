package com.cmr.proj.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
public static Connection con;
	
	static {
		try {
			//step:1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Class Loaded successfully");
			//step:2
			final String URL="jdbc:oracle:thin:@localhost:1521";
			final String userName="Project";
			final String passWord="Project";
			
			con= DriverManager.getConnection(URL,userName,passWord);
			System.out.println("Established connection successfully");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Failed to load driver class.....");
		}
		catch(SQLException e){
			System.out.println("Failed "+e);
		}

	}
	public static Connection getConnection() {
		return con;
	}


}
