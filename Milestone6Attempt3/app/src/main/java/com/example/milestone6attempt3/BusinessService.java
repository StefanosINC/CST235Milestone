package com.example.milestone6attempt3;

import java.util.ArrayList;

public class BusinessService {
	// this is an object to hold the global varaiable and methods to persist data
	// the list is the main data storage structure 
	
	public AddressBook List;
	public BusinessService(AddressBook list) {
		super();
		this.setList(list);
	}
	
	
	public BusinessService() {
		super();
		this.setList(new AddressBook());
		
	}
	public void saveAllLists() {
		// write all data to the file / database
		DataAccessService das = new FileAccessService();
		das.writeAllData(this);
	}
	
	public ArrayList<BaseContact> loadAllLists() {
		// read data from file / data base
		DataAccessService das = new FileAccessService();
		return das.readAllData();
	}
	
	
	
	public AddressBook getList() {
		return List;
	
		
	}
	public void setList(AddressBook list) {
		this.List = list;
	}
	
	
	
}
