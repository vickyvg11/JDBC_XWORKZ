package com.selectAndConnectionClose;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

public class Laptop2 {

	public static void main(String[] args) {

		
		String url= "jdbc:mysql://localhost:3306/Store";
		String userName= "root";
		String password= "vicky123";
		
		Connection connection = null;

		String insertQuery1= "INSERT INTO laptop_details value(1,'DELL',31100,'CORE I5',500)";
		String insertQuery2="INSERT INTO laptop_details value(2,'HP',52000,'CORE I7',700)";
		String insertQuery3=" INSERT INTO laptop_details value(3,'LENOVa',35000,'CORE I7',700)";
		String insertQuery4="INSERT INTO laptop_details value(4,'HP',90000,'CORE I5',600)";
		String insertQuery5="INSERT INTO laptop_details value(5,'ACER',6500,'CORE I5',800)";

		String updateQuery1 ="UPDATE Store.laptop_details SET BRAND='MACBOOK' WHERE ID=4";

		String deleteQuery1 = "DELETE FROM Store.laptop_details WHERE ID=5;";
		

		String readSingleRowByID = "SELECT *FROM laptop_details WHERE ID=1";

		String readAllRecord = "SELECT*FROM laptop_details";

		try {

			//	Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(url, userName, password);

			System.out.println("Connection is Sucessfull with Database:"+url);
			Statement statement = connection.createStatement();		
			
			
			
//			ResultSet resultSet = statement.executeQuery(readSingleRowByID);
//			
//			resultSet.next();
//			
//			System.out.println("Id 1st row " + resultSet.getInt(1));
//			System.out.println("BRAND 1st row " + resultSet.getString(2));
//			System.out.println("PRICE 1st row " + resultSet.getInt(3));
//			System.out.println("PROCESSR 1st row " + resultSet.getString(4));
//			System.out.println("STORAGE 1st row " + resultSet.getInt(5));
			
			
			
			ResultSet resultSet = statement.executeQuery(readAllRecord);
			//	boolean isRowPresent = resultSet.next(); // 1 or 0
			//	while(isRowPresent) {
			
			
			while(resultSet.next()) {
				System.out.println("Id row:  " + resultSet.getInt(1));
				System.out.println("BRAND row: " + resultSet.getString(2));
				System.out.println("PRICE row: " + resultSet.getInt(3));
				System.out.println("PROCESSR row: " + resultSet.getString(4));
				System.out.println("STORAGE row: " + resultSet.getInt(5));
			}
			
			
			
			
//			statement.executeUpdate(insertQuery1);
//			System.out.println("First row is insert");
//			statement.executeUpdate(insertQuery2);
//			System.out.println("Second row is insert");
//			statement.executeUpdate(insertQuery3);
//			System.out.println("third row is insert");
//			statement.executeUpdate(insertQuery4);
//			System.out.println("Fourth row is insert");
//			statement.executeUpdate(insertQuery5);
//			System.out.println("Fiveth row is insert");
//
//			statement.executeUpdate(updateQuery1);
//			System.out.println("first row is updated processore i5 to i7");
//			statement.executeUpdate(deleteQuery1);
//			System.out.println("delete fourth row");

		
			
			
			
			
		} 


		catch (SQLException sqlException) {

			System.out.println(sqlException.getMessage());
		}

		catch (Exception ClassNotFoundException) {
			System.out.println(ClassNotFoundException.getMessage());
			//	ClassNotFoundException.getStackTrace();
		}
		finally {
			if(connection != null) {
				System.out.println("connection closed");
			}
			else {
				System.out.println("connection is not closed");
			}

		}

	}

}
