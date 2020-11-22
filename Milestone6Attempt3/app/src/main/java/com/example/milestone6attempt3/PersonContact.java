package com.example.milestone6attempt3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PersonContact extends BaseContact implements List<BaseContact> {
	
	private String nickName;
// Constructor
	public PersonContact(String name, String city, String state, String postalCode, String country, String phoneNumber,
			String email, String nickName) {
		super(name, city, state, postalCode, country, phoneNumber, email, nickName);
		this.nickName = nickName;
	}

	// Search size contact
	// Constructor that was forced to make
	// HAD TO MAKE THIS
	public PersonContact() {
		
	}

	public void search(AddressBook contact) {

	}
// compare to Base contact
	public int compareTo(BaseContact otherbaseContact) {
		return 0;
	}

	
	// *** THIS IS MY TOSTRING METHOD TO CALL ON PERSON CONTACT
	@Override
	public String toString() {
		return super.name + " | " + super.city + " | " + super.state + " | " + super.postalCode + " | " + super.country
				+ " | " + super.phoneNumber + " | " + super.email + " | " + this.nickName + " | ";
	}
	
	
//	
//	
//	String Newname, Newcity, Newstate, Newpostal, Newcountry, NewphoneNumber, Newemail, NewnickName, NewcompanyName,
//	NewsearchString, newiD, searchCity, newStreetName, newStateName, newpostalCode, newemailString,
//	newCountryString, newCompanyString;
//	
	
	

//	public String getNewname() {
//		return Newname;
//	}
//
//	public void setNewname(String newname) {
//		Newname = newname;
//	}
//
//	public String getNewcity() {
//		return Newcity;
//	}
//
//	public void setNewcity(String newcity) {
//		Newcity = newcity;
//	}
//
//	public String getNewstate() {
//		return Newstate;
//	}
//
//	public void setNewstate(String newstate) {
//		Newstate = newstate;
//	}
//
//	public String getNewpostal() {
//		return Newpostal;
//	}
//
//	public void setNewpostal(String newpostal) {
//		Newpostal = newpostal;
//	}
//
//	public String getNewcountry() {
//		return Newcountry;
//	}
//
//	public void setNewcountry(String newcountry) {
//		Newcountry = newcountry;
//	}
//
//	public String getNewphoneNumber() {
//		return NewphoneNumber;
//	}
//
//	public void setNewphoneNumber(String newphoneNumber) {
//		NewphoneNumber = newphoneNumber;
//	}
//
//	public String getNewemail() {
//		return Newemail;
//	}
//
//	public void setNewemail(String newemail) {
//		Newemail = newemail;
//	}
//
//	public String getNewnickName() {
//		return NewnickName;
//	}
//
//	public void setNewnickName(String newnickName) {
//		NewnickName = newnickName;
//	}
//
//	public String getNewcompanyName() {
//		return NewcompanyName;
//	}
//
//	public void setNewcompanyName(String newcompanyName) {
//		NewcompanyName = newcompanyName;
//	}
//
//	public String getNewsearchString() {
//		return NewsearchString;
//	}
//
//	public void setNewsearchString(String newsearchString) {
//		NewsearchString = newsearchString;
//	}
//
//	public String getNewiD() {
//		return newiD;
//	}
//
//	public void setNewiD(String newiD) {
//		this.newiD = newiD;
//	}
//
//	public String getSearchCity() {
//		return searchCity;
//	}
//
//	public void setSearchCity(String searchCity) {
//		this.searchCity = searchCity;
//	}
//
//	public String getNewStreetName() {
//		return newStreetName;
//	}
//
//	public void setNewStreetName(String newStreetName) {
//		this.newStreetName = newStreetName;
//	}
//
//	public String getNewStateName() {
//		return newStateName;
//	}
//
//	public void setNewStateName(String newStateName) {
//		this.newStateName = newStateName;
//	}
//
//	public String getNewpostalCode() {
//		return newpostalCode;
//	}
//
//	public void setNewpostalCode(String newpostalCode) {
//		this.newpostalCode = newpostalCode;
//	}
//
//	public String getNewemailString() {
//		return newemailString;
//	}
//
//	public void setNewemailString(String newemailString) {
//		this.newemailString = newemailString;
//	}
//
//	public String getNewCountryString() {
//		return newCountryString;
//	}
//
//	public void setNewCountryString(String newCountryString) {
//		this.newCountryString = newCountryString;
//	}
//
//	public String getNewCompanyString() {
//		return newCompanyString;
//	}
//
//	public void setNewCompanyString(String newCompanyString) {
//		this.newCompanyString = newCompanyString;
//	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<BaseContact> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(BaseContact e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends BaseContact> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(int index, Collection<? extends BaseContact> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub

	}

	public BaseContact get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseContact set(int index, BaseContact element) {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(int index, BaseContact element) {
		// TODO Auto-generated method stub

	}

	public BaseContact remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ListIterator<BaseContact> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListIterator<BaseContact> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BaseContact> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

// GET AND SET NICK NAM 

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	

	

}