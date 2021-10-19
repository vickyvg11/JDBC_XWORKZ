package com.jdbc.lap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.lapentity.LapEntity;

public class LapDaoImpl implements LapDao {
	public List<LapEntity> readAllRecord() {
		System.out.println("invoked readAllRecordById");
		String readAllRecord = "SELECT * FROM LAP_DETAILS; ";
		
		List<LapEntity> container = new ArrayList<LapEntity>();
		LapEntity laptopEntity = null;
		try {
			Connection connection = ConnectionEstablish.getconnection();
			PreparedStatement preparedstatement = connection.prepareStatement(readAllRecord);
			// *boolean isRowPresent = resultSet.next();
			// *while(isRowPresent)

			ResultSet resultset = preparedstatement.executeQuery(readAllRecord);
			while (resultset.next()) {
				int id = resultset.getInt(1);
				String brand = resultset.getString(2);
				String color = resultset.getString(3);
				int price = resultset.getInt(4);
				String processor = resultset.getString(5);
				int screensize = resultset.getInt(6);
				int weight = resultset.getInt(7);
				boolean graphicard = resultset.getBoolean(8);
				boolean screentouch = resultset.getBoolean(9);
			

				laptopEntity = new LapEntity(id, brand, color, price, processor,screensize,weight,graphicard,screentouch);
				container.add(laptopEntity);
			}
		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		return container;

/*	public void saveLaptopRecord(LapEntity laptopEntity ) {

		String saveLaptopDetails="insert Store.LAP_DETAILS value(?,?,?,?,?,?,?,?,?);";

		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement pstmt=cn.prepareStatement(saveLaptopDetails);
            pstmt.setInt(1,laptopEntity.getId());
            pstmt.setString(2,laptopEntity.getColor());
            pstmt.setString(3, laptopEntity.getBrand());
            pstmt.setInt(4,laptopEntity.getPrice());
            pstmt.setString(5, laptopEntity.getProcessor());
            pstmt.setInt(6, laptopEntity.getScreensize());
            pstmt.setInt(7, laptopEntity.getWeight());
            pstmt.setBoolean(8, laptopEntity.isGraphicard());
            pstmt.setBoolean(9, laptopEntity.isScreentouch());
            pstmt.executeUpdate();
			System.out.println("laptop record row Inserted");
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateBrand(LapEntity laptopEntity) {

		String updatelaptopBrand="update Store.LAP_DETAILS set brand = ? where id =?";
		try {
			System.out.println("Connection established :");
			Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement pstmt=cn.prepareStatement(updatelaptopBrand);
            pstmt.setString(1, laptopEntity.getBrand());
            pstmt.setInt(2,laptopEntity.getId());
			pstmt.executeUpdate();
			System.out.println("laptop brand is update");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBrandAndPrice(LapEntity laptopEntity) {

		String updatelaptopBrandAndPrice="update Store.LAP_DETAILS set brand = ? ,price=? where id =?;";

		try {

			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement pstmt=cn.prepareStatement(updatelaptopBrandAndPrice);
            pstmt.setString(1,laptopEntity.getBrand());
            pstmt.setInt(2,laptopEntity.getPrice());
            pstmt.setInt(3,laptopEntity.getId());
            pstmt.executeUpdate();
			System.out.println("laptop brand  and price is update");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletLaptopById(LapEntity laptopEntity) {

		String deletelaptopDetails="delete from Store.LAP_DETAILS where id=?;";

		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement stmt=cn.prepareStatement(deletelaptopDetails);
            stmt.setInt(1,laptopEntity.getId());
            stmt.executeUpdate();
			System.out.println("one of the laptop Details deleted");
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void readSingleRecordById(LapEntity laptopEntity) {

		String readBrandByID="select brand from LAP_DETAILS where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement stmt=cn.prepareStatement(readBrandByID);
            stmt.setInt(1, laptopEntity.getId());
            ResultSet rs=stmt.executeQuery();

			while(rs.next()) {

				System.out.println("Brand :" +rs.getString(1));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readAllRecords(LapEntity laptopEntity) {

		String LaptopDetails="select * from Store.LAP_DETAILS;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement stmt=cn.prepareStatement(LaptopDetails);
            ResultSet rs=stmt.executeQuery();

			while(rs.next()) {
				System.out.println("ID :" +rs.getInt(1));
				System.out.println("brand :" +rs.getString(2));
				System.out.println("color :" +rs.getString(3));
				System.out.println("price :" +rs.getInt(4));
				System.out.println("processor :" +rs.getString(5));
				System.out.println("Screensize :" +rs.getInt(6));
				System.out.println("weight :" +rs.getInt(7));
				System.out.println("graphicard :" +rs.getBoolean(8));
				System.out.println("screentouch :" +rs.getBoolean(9));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readLaptopPriceById(LapEntity laptopEntity) {

		String readPricelByID="select price from Store.LAP_DETAILS where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement stmt=cn.prepareStatement(readPricelByID);  
            stmt.setInt(1,laptopEntity.getId());
			ResultSet rs=stmt.executeQuery();

			while(rs.next()) {

				System.out.println("price :" +rs.getString(1));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readLaptopBrandAndPriceById(LapEntity laptopEntity) {
		String readLaptopBrandAndPriceById="select brand ,price from LAP_DETAILS where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement stmt=cn.prepareStatement(readLaptopBrandAndPriceById);
            stmt.setInt(1, laptopEntity.getId());
            ResultSet rs=stmt.executeQuery();

			while(rs.next()) {
				System.out.println("brand :" +rs.getString(1));
				System.out.println("price:" +rs.getInt(2));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readLaptopcolorByID(LapEntity laptopEntity) {

		String readColorByID="select color from LAP_DETAILS where id=?;";
		try {
			System.out.println("Connection established :");
            Connection cn=ConnectionEstablish.getconnection();
            PreparedStatement stmt=cn.prepareStatement(readColorByID);
            stmt.setInt(1, laptopEntity.getId());
            ResultSet rs=stmt.executeQuery();

			while(rs.next()) {

				System.out.println("color :" +rs.getString(1));
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ConnectionEstablish.closeConnection();
	}*/
	
	
}
}