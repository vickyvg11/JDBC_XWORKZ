package com.jdbc.laptop.test;

import java.util.List;

import com.jdbc.lap.LapDao;
import com.jdbc.lap.LapDaoImpl;
import com.jdbc.lapentity.LapEntity;

public class LaptopTest {

	public static void main(String...args) {


		LapDaoImpl lapdao = new LapDaoImpl();
		List<LapEntity> allrecords = lapdao.readAllRecord();
		for (LapEntity laptopEntity : allrecords) {
			System.out.println(laptopEntity + "/t");
			System.out.println();
			System.out.println("-----------------------------");
		
	}
}
}