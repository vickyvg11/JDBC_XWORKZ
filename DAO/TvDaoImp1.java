package com.xworkz.tv.dao;

import java.sql.*;

public class TvDaoImp1 implements TvDao {

	@Override
	public void insertTv() {


		String url= "jdbc:mysql://localhost:3306/TV";
		String userName= "root";
		String password= "vicky123";


		//String insertTv = "INSERT INTO TV_INFO VALUES (1,'MI',26000,'LCD','HD+')";

		//String insertTv1 = "INSERT INTO TV_INFO VALUES (2,'Realme',28000,'LED','FULLHD')";
		//String insertTv2 = "INSERT INTO TV_INFO VALUES (3,'samsung',30000,'QLED','ULTRAHD')";
		//String insertTv3 = "INSERT INTO TV_INFO VALUES (4,'LG',32000,'LCD','HD+')";

		String insertTv4 = "INSERT INTO TV_INFO VALUES (4,'LG',32000,'LCD','HD+')";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			System.out.println("Connection sucessfull"+url);

			Statement statement = connection.createStatement();

			//statement.execute(insertTv);
			statement.execute(insertTv4);
		}catch (Exception Exception)
		{

			System.out.println(Exception.getMessage());
			Exception.getStackTrace();			
		}
		finally {
			try {
				if (connection!= null){
					connection.close();
					System.out.println("connection is closed..");
				}
				else {
					System.out.println("connection is not closed");
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteTv() { 

		String url= "jdbc:mysql://localhost:3306/TV";
		String userName= "root";
		String password= "vicky123";




		System.out.println("Invoked the delete method");
		String deletequery1 = "DELETE FROM TV_INFO WHERE ID = 4";

		Connection  connection =null;

		try {
			connection = DriverManager.getConnection(url,userName,password);
			System.out.println("conncetion is sucess"+url);

			Statement statement = connection.createStatement(); 
			statement.executeUpdate(deletequery1);
			System.out.println("Deleted query of row 4");
		}

		catch (SQLException sqlException){
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) {
					connection.close();
					System.out.println("connection Closed");

				}	 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updatePrice() {
		String url= "jdbc:mysql://localhost:3306/TV";
		String userName= "root";
		String password= "vicky123";

		String updatePrice = "UPDATE TV_INFO SET PRICE = 25000 WHERE COMPANY = 'LG'";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,userName,password);
			System.out.println("conncetion is sucess"+url);

			Statement statement = connection.createStatement(); 
			statement.executeUpdate(updatePrice);
			System.out.println("Updated row");

		} catch (SQLException sqlException){
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

		finally {
			try	{
				if (connection!=null) {
					connection.close();
					System.out.println("Connection is Closed");
				}
				else {
					System.out.println("Connection is not Closed");
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void readAllData() {
		String url= "jdbc:mysql://localhost:3306/TV";
		String userName= "root";
		String password= "vicky123";

		String readAllData = "SELECT * FROM TV_INFO";
		Connection connection = null ;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucess"+url);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllData);

			while (resultSet.next()) {
				System.out.println("ID"+ resultSet.getInt(1));
				System.out.println("COMPANY "+ resultSet.getString(2));
				System.out.println("PRICE "+ resultSet.getInt(3));
				System.out.println("TYPE "+ resultSet.getString(4));
				System.out.println("Resolution"+resultSet.getString(5));

			}

		}		catch (SQLException sqlexception) {
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) {
					connection.close();
					System.out.println("Coneection is closed");

				}
				else 
				{
					System.out.println("connection is not closed");
				}
			}
			catch	(SQLException e) {

				e.printStackTrace();
			}
		}	
	}


	@Override
	public void readSingleRow() {

		String url= "jdbc:mysql://localhost:3306/TV";
		String userName= "root";
		String password= "vicky123";

		String readSingleRow ="select price FROM TV_INFO WHERE id=3";
		Connection connection = null ;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection is sucess"+url);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readSingleRow);
			resultSet.next();
			System.out.println("Price:"+resultSet.getInt(1));
		}
		catch (SQLException sqlexception) {
			System.out.println(sqlexception.getMessage());
			sqlexception.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) {
					connection.close();
					System.out.println("connection closed");

				}else {
					System.out.println("Connection is  Not Closed");
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	

	@Override
	public void readTvCompanyByID() {
	
		
		String url = "jdbc:mysql://localhost:3306/TV";
		String userName = "root";
		String password = "vicky123";
		Connection connection = null;
		String readLaptopColorById="select COMPANY FROM TV_INFO WHERE id=2;";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopColorById);
			resultSet.next();
			System.out.println("Company: "+ resultSet.getString(1));
			

		}catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
	}		
	
}
}