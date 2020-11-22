package com.example.milestone6attempt3;



public abstract class BaseContact implements Comparable<BaseContact> {
		protected String name;
		protected String streetName;
		protected String city;
		protected String state;
		protected String postalCode;
		protected String country;
		protected String phoneNumber;
		protected String photoName;
		protected String email;
		protected String photo;
		
		
		
		
		public BaseContact(String name, String city, String state, String postalCode, String country, String phoneNumber, 
				 String email, String photo) {
			super();
			this.name = name;
			this.city = city;
			this.state = state;
			this.postalCode = postalCode;
			this.country = country;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.photo = photo;    
		}
		
		
		// default constructor
		public BaseContact() {
			this.name = "No name inserted yet";
			this.streetName = "123 main st";
			this.city = "Omaha";
			this.state = "NE";
			this.postalCode = "50921";
			this.country = "United States";
			this.phoneNumber = "422-321-9325";
			this.photo = "photo name";
			
			
			
			
			}
			// creating my getters and setters
			
			
//		}
//		public String getId() {
//			return id;
//		}
//		public void setId(String id) {
//			this.id = id;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStreetName() {
			return streetName;
		}
		public void setStreetName(String streetName) {
			this.streetName = streetName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getPhotoName() {
			return photoName;
		}
		public void setPhotoName(String photoName) {
			this.photoName = photoName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void callContact() {
			System.out.println("Calling... " + this.getName());
		}
		public void textContact() {
			System.out.println("Texting... " + this.getName());
		}
		public void navigateToContact() {
			System.out.println("Navigating to... " + this.city + " " + this.state + " " + this.postalCode);
		}
		public void emailContact() {
			System.out.println("Emailing... " + this.getName());
		}
		
		
		// Search the base contact for a person contact
		
	}


