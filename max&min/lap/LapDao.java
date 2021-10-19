package com.jdbc.lap;

import java.util.List;

import com.jdbc.lapentity.LapEntity;

public interface LapDao {

	List<LapEntity> readAllRecord();
	
	void minOfLaptopDetails(int price);
    
    void maxOfLaptopDetails(LapEntity laptopEntity);
    
    void avgOfLaptopDetails(LapEntity laptopEntity);
    
    void sumOfLaptopDetails(LapEntity laptopEntity);
    
	/*	void saveLaptopRecord(LapEntity laptopEntity);

	void  updateBrand(LapEntity laptopEntity);

	void updateBrandAndPrice(LapEntity laptopEntity);

	void deletLaptopById(LapEntity laptopEntity);

	void readSingleRecordById(LapEntity laptopEntity);

	void readAllRecords(LapEntity laptopEntity);

	void readLaptopPriceById(LapEntity laptopEntity);

	void readLaptopBrandAndPriceById(LapEntity laptopEntity);

	void readLaptopcolorByID(LapEntity laptopEntity);*/
	
	
}
