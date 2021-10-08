package com.jdbc.lap;

import java.sql.*;
public class LaptopRunner {

	
	public static void main(String[] args) {
		
		String url= "jdbc:mysql://localhost:3306/Laptop";
		String userName= "root";
		String password= "vicky123";
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			
			System.out.println("Connection is Sucessfull with Database:"+url);
			
		} 
		
		
		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}

		catch (ClassNotFoundException ClassNotFoundException) {
		//	System.out.println(ClassNotFoundException.getMessage());
			ClassNotFoundException.getStackTrace();
		}
		

}

}
