package com.simplilearn.licia.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		
//    		Define the URL to connect
    		String urlToConnect = "jdbc:mysql://localhost:3306/simplilearn_licia";
    		
//    		Define the username for db to connect
    		String dbUserName = "root";
    		
//    		Define the password
    		String dbUserPassword = "";
    		
//    		Define the driver for the database
    		String mySqlDriver = "com.mysql.cj.jdbc.Driver";
    		
//        	Load the Driver
			Class.forName(mySqlDriver);
			
//			Try to establish the connection
			Connection dbCon = DriverManager.getConnection(urlToConnect, dbUserName, dbUserPassword);
			
			
//			System.out.println("Successfully connected to the database...");
			
			System.out.println("Great job! You are connected to the DB!");
    		
    	} catch (ClassNotFoundException e) {
			System.out.println("Can't load the Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to DB : " + e.getMessage());
		} 
    }
}
