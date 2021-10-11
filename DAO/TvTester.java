package com.xworkz.tv.dao;
import java.sql.*;


public class TvTester {

	public static void main(String[] args) {
		
		 TvDaoImp1 tvdao  = new TvDaoImp1();
		// tvdao.insertTv();
		// tvdao.updatePrice();
		// tvdao.deleteTv();
		// tvdao.readAllData();
		// tvdao.readSingleRow();
		 tvdao.readTvCompanyByID();
	}

}
