package com.example.milestone6attempt3;


public class BusinessContact extends BaseContact {
		// create private string
	
	private String companyName;
	private String iD;
	private String photo;
	public BusinessContact() {
		super();
	}
// constructor
	public BusinessContact(String name, String city, String state, String postalCode, String country,
			String phoneNumber, String email, String companyName) {
		super(name, city, state, postalCode, country, phoneNumber, email, companyName);
		this.companyName = companyName;
//		this.photo = photo;
	}

	// getters and setters
	
	
	
	public String getCompanyName() {
		return companyName;
	}

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int compareTo(BaseContact o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	// Override method toString that will allow me to print out everything properly
	
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	@Override
	public String toString() {
		return super.name + " | " + super.city + " | " + super.state + " | " + super.postalCode + " | " + super.country
				+ " | " + super.phoneNumber + " | " + super.email + " | " + this.companyName + " | ";
	}
	
}
