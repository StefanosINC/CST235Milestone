package com.example.milestone6attempt3;
import java.io.IOException;
import java.util.ArrayList;
public interface DataAccessService {
	
	public ArrayList<BaseContact> readAllData();
	

	boolean saveAllContacts();


	public void writeAllData(BusinessService FileAc);
	
	//void writeAllData(String fileName, String test, boolean append) throws IOException;
}

