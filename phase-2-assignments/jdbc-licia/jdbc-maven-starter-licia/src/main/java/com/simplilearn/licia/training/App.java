package com.simplilearn.licia.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		
//        	Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Try to establish the connection
			Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn_licia", "root", "");
			
			System.out.println("Great job! You are connected to the DB!");
    		
    	} catch (ClassNotFoundException e) {
			System.out.println("Can't load the Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to DB : " + e.getMessage());
		} 
    }
}
