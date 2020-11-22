package com.example.milestone6attempt3;



import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.ArrayList;
import java.util.PrimitiveIterator.OfDouble;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test extends FileAccessService {
	public AddressBook list;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddressBook ab = new AddressBook();

		Scanner stringInput = new Scanner(System.in);


		// OBJECT P1 P2 3

		PersonContact p1 = new PersonContact("Will Smith", "NewYork", "NewYork", "23999", "United States",
				"123-123-4444", "Stefanos@gmail.com", "Willie");
		PersonContact p2 = new PersonContact("Stefanos", "Fresno", "Ca", "93111", "UnitedStates", "559-999-3123",
				"Email@dress", "Greek Boi");
		PersonContact p3 = new PersonContact("John", "Phoenix", "AZ", "12313", "United States", "233-131-1312",
				"Email1232@adress", "Nerd");

		BusinessContact p4 = new BusinessContact("Bob", "Jersey", "NY", "12313", "United States", "233-131-1312",
				"Email1232@adress", "AT&T");

		// PRINT OUT THE OBJECTS PERSON
		System.out.println("\n===== 1st person object ====");
		System.out.println(p1.toString());

		System.out.println("\n===== 2nd person object====");
		System.out.println(p2.toString());

		System.out.println("\n======= 3rd Person object====");
		System.out.println(p3.toString());

		System.out.println("\n======= 4th Business object====");
		System.out.println(p3.toString());
// ADD THE PERSON OBJECTS TO THE ADDRESS BOOK
		ab.addOne(p1);
		ab.addOne(p2);
		ab.addOne(p3);
		ab.addOne(p4);
		
		// DISPLAY CONTACTS
		ab.displayContacts();
		// SEARCH

		ab.search("b");

		// GET THE LIST AND CALL ON SPECIFICS
		ab.theList.get(0).callContact();
		ab.theList.get(0).navigateToContact();
		ab.theList.get(0).emailContact();
		ab.theList.get(0).textContact();
		// DELETE METHODS
		// ab.deleteOne(p3);
		// ab.deleteOne(p4);

		
// Load All PRESET CONTACTS
	 
		

		// DECLARE NEW VARIABLES
		String userInput = "";
		String contact = "";

		String Newname, Newcity, Newstate, Newpostal, Newcountry, NewphoneNumber, Newemail, NewnickName, NewcompanyName,
				NewsearchString, newiD, searchCity, newStreetName, newStateName, newpostalCode, newemailString,
				newCountryString, newCompanyString;

		
		
		boolean exitWhile = true;
		while (!userInput.equals("stop")) {
			// Menu
			System.out.println("== WELCOME TO THE MENU==");
			System.out.println("1: Add Person Contact");
			System.out.println("2: Add Business Contact");
			System.out.println("3: Show All Contacts");
			System.out.println("4: EDIT a Contact");
			System.out.println("5: Search the contacts by name/url etc");
			System.out.println("6: file data testing");
			System.out.println("To get out of the menu, type stop (case sensitive)");
			contact = stringInput.nextLine();
			switch (contact) {

			// SWITCH Cases Adding Contact Personal
			case "1":
				System.out.println("Enter a name");
				Newname = stringInput.nextLine();
				System.out.println(Newname);

				System.out.println("Enter a city");
				Newcity = stringInput.nextLine();
				System.out.println(Newcity);

				System.out.println("State?");
				Newstate = stringInput.nextLine();
				System.out.println(Newstate);

				System.out.println("PostalCode");
				Newpostal = stringInput.nextLine();
				System.out.println(Newpostal);

				System.out.println("Country?");
				Newcountry = stringInput.nextLine();
				System.out.println(Newcountry);

				System.out.println("Phone");
				NewphoneNumber = stringInput.nextLine();
				System.out.println(NewphoneNumber);

				System.out.println("email");
				Newemail = stringInput.nextLine();
				System.out.println(Newemail);

				System.out.println("Nickname");
				NewnickName = stringInput.nextLine();
				System.out.println(NewnickName);

//				System.out.println("ID #");
//				newId = stringInput.next();
//				System.out.println(newId);
				// Person Object
				
				PersonContact pContact = new PersonContact(Newname, Newcity, Newstate, Newpostal, Newcountry,
						NewphoneNumber, Newemail, NewnickName);
				
				
				
				
				ab.theList.add(pContact);
				// adds records from new contacts
				SaveRecords("in.txt", pContact.toString(), true);
			
				// System.out.println(ab.theList);
				break;

			// ADD BUISNESS CONTACT
			case "2":
				System.out.println("Add buisness contact");

				System.out.println("Enter a name");
				Newname = stringInput.nextLine();
				System.out.println(Newname);

				System.out.println("Enter a city");
				Newcity = stringInput.nextLine();
				System.out.println(Newcity);

				System.out.println("State?");
				Newstate = stringInput.nextLine();
				System.out.println(Newstate);

				System.out.println("PostalCode");
				Newpostal = stringInput.nextLine();
				System.out.println(Newpostal);

				System.out.println("Country?");
				Newcountry = stringInput.nextLine();
				System.out.println(Newcountry);

				System.out.println("Phone");
				NewphoneNumber = stringInput.next();
				System.out.println(NewphoneNumber);

				System.out.println("email");
				Newemail = stringInput.next();
				System.out.println(Newemail);

				System.out.println("CompanyName");
				NewcompanyName = stringInput.next();
				System.out.println(NewcompanyName);

				// BusinessContact
				BusinessContact bContact = new BusinessContact(Newname, Newcity, Newstate, Newpostal, Newcountry,
						NewphoneNumber, Newemail, NewcompanyName);
					
				// BusinessContact add to addressbook
				ab.addOne(bContact);
				// add records to textfile

				SaveRecords("in.txt", bContact.toString(), true);
				break;

			case "3":
				// Display Contacts
				ab.displayContacts();

				break;
			// Case 4 update
			case "4":
				System.out.println("what type would u like to update?" + "\n" + "personal" + "\n" + "Business");
				Scanner update1 = new Scanner(System.in);
				String updatedContact = update1.nextLine();

				// Access the basecontact List and see if user wants to update
				System.out.println("What contact do u want to update?" + "State the Name of Name the Contact");
				Scanner readNewName = new Scanner(System.in);
				String readUpdatedNewName = readNewName.nextLine();

				for (BaseContact Contact : ab.theList) {

					// user enter the " " and its not case sensitive
					if (updatedContact.equalsIgnoreCase("personal")) {
						if (Contact.getName().equalsIgnoreCase(readUpdatedNewName)) {
							System.out.println(Contact);

							// Ask user if wants to update? // Change anything
							// use scanners

							System.out.println("What do you want to update?"
									+ "You can enter name, city, state, postalcode, country, phone, email");
							Scanner userOption = new Scanner(System.in);
							String readUpdate = userOption.nextLine();

							// user input name . read user update
							if (readUpdate.equalsIgnoreCase("Name")) {
								System.out.println("Enter the contact's new name");
								Scanner editName = new Scanner(System.in);
								String updatedName = editName.nextLine();
								Contact.setName(updatedName);
							}
							// user input city . read user update
							if (readUpdate.equalsIgnoreCase("city")) {
								System.out.println("Enter new Contact City");
								Scanner changeCity = new Scanner(System.in);
								String newCity = changeCity.nextLine();
								Contact.setCity(newCity);

							}
							// user input state . read user update
							if (readUpdate.equalsIgnoreCase("state")) {
								System.out.println("Enter new State");
								Scanner changeState = new Scanner(System.in);
								String newState = changeState.nextLine();
								Contact.setState(newState);
							}
							// user input postal code . read user update
							if (readUpdate.equalsIgnoreCase("PostalCode")) {
								System.out.println("PostalCode");
								Scanner changePostalCode = new Scanner(System.in);
								String newPostalCode = changePostalCode.nextLine();
								Contact.setPostalCode(newPostalCode);

							}

							// user input country read user update and
							if (readUpdate.equalsIgnoreCase("Country")) {
								System.out.println("Country");
								Scanner changeCountry = new Scanner(System.in);
								String newCountry = changeCountry.nextLine();
								Contact.setCountry(newCountry);
							}
							// user input phone read user change
							if (readUpdate.equalsIgnoreCase("Phone")) {
								System.out.println("Phone");
								Scanner changePhone = new Scanner(System.in);
								String newPhone = changePhone.nextLine();
								Contact.setPhoneNumber(newPhone);

							}
							// user input email read user change
							if (readUpdate.equalsIgnoreCase("email")) {
								System.out.println("email");
								Scanner changeEmail = new Scanner(System.in);
								String newEmail = changeEmail.nextLine();
								Contact.setEmail(newEmail);
							}

							// user input phone read user change
							if (readUpdate.equalsIgnoreCase("Photo")) {
								System.out.println("Enter the contact's new photo file");
								Scanner changePhoto = new Scanner(System.in);
								String newPhoto = changePhoto.nextLine();
								Contact.setPhotoName(newPhoto);
							}
							// user input nickname read user change
							if (readUpdate.equalsIgnoreCase("nickName")) {
								System.out.println("Enter the contact's new nickname");
								Scanner changeNickName = new Scanner(System.in);
								String newNickname1 = changeNickName.nextLine();
								((PersonContact) Contact).setNickName(newNickname1);
							}

						}
					}

					// SIMILAR UPDATE AS PERSONAL. EXCEPT THE BUSINESS
					if (updatedContact.equalsIgnoreCase("Business")) {
						if (Contact.getName().equalsIgnoreCase(readUpdatedNewName)) {
							System.out.println("-------------Contact-----------");
							System.out.println(Contact);

							// ENTER A SPECIFIC YOU WANT TO CHANGE
							System.out.println(
									"Would would u like to change: You can enter (name)  (city)  (state) (postalcode) (state) (phone) (email) (companyName)");
							Scanner userOption1 = new Scanner(System.in);
							String readUpdated = userOption1.nextLine();

							if (readUpdated.equalsIgnoreCase("name")) {
								System.out.println("Enter the name you would like to edit it to");
								Scanner changeName = new Scanner(System.in);
								String updatedName = changeName.nextLine();
								Contact.setName(updatedName);
							}

							if (readUpdated.equalsIgnoreCase("city")) {
								System.out.println("Enter new Contact City");
								Scanner changeCity = new Scanner(System.in);
								String newCity = changeCity.nextLine();
								Contact.setCity(newCity);

							}
							if (readUpdated.equalsIgnoreCase("state")) {
								System.out.println("Enter new State");
								Scanner changeState = new Scanner(System.in);
								String newState = changeState.nextLine();
								Contact.setState(newState);
							}
							if (readUpdated.equalsIgnoreCase("PostalCode")) {
								System.out.println("PostalCode");
								Scanner changePostalCode = new Scanner(System.in);
								String newPostalCode = changePostalCode.nextLine();
								Contact.setPostalCode(newPostalCode);

							}

							if (readUpdated.equalsIgnoreCase("Country")) {
								System.out.println("Country");
								Scanner changeCountry = new Scanner(System.in);
								String newCountry = changeCountry.nextLine();
								Contact.setCountry(newCountry);
							}
							if (readUpdated.equalsIgnoreCase("Phone")) {
								System.out.println("Phone");
								Scanner changePhone = new Scanner(System.in);
								String newPhone = changePhone.nextLine();
								Contact.setPhoneNumber(newPhone);

							}
							if (readUpdated.equalsIgnoreCase("email")) {
								System.out.println("email");
								Scanner changeEmail = new Scanner(System.in);
								String newEmail = changeEmail.nextLine();
								Contact.setEmail(newEmail);
							}
							if (readUpdated.equalsIgnoreCase("CompanyName")) {
								System.out.println("CompanyName");
								Scanner changeCompanyName = new Scanner(System.in);
								String newCompanyName = changeCompanyName.nextLine();
								((BusinessContact) Contact).setCompanyName(newCompanyName);

							}
							if (readUpdated.equalsIgnoreCase("Photo")) {
								System.out.println("Enter the contact's new photo file");
								Scanner changePhoto = new Scanner(System.in);
								String newPhotoName = changePhoto.nextLine();
								((BusinessContact) Contact).setPhotoName(newPhotoName);
							}

							// print updated List
							System.out.println("===== updatedContact list contacts========");
							System.out.println(ab.theList);

						}
					}

				}
				break;
			// SEARCH THE CRITIERIA

			case "5":

				System.out.println("Search the City: Enter City");
				searchCity = stringInput.nextLine();
				ab.searchCity(searchCity);

				System.out.println("Enter the name of the contact you want to search!");
				NewsearchString = stringInput.nextLine();
				ab.search(NewsearchString);

				System.out.println("Enter the State");
				newStateName = stringInput.nextLine();
				ab.searchState(newStateName);

				System.out.println("Enter the postalCode");
				newpostalCode = stringInput.nextLine();
				ab.searchPostalCode(newpostalCode);

				System.out.println("Enter the email");
				newemailString = stringInput.nextLine();
				ab.searchEmail(newemailString);

				System.out.println("Enter the Country");
				newCountryString = stringInput.nextLine();
				ab.searchCountry(newCountryString);

				System.out.println("Enter the company name?");
				newCompanyString = stringInput.nextLine();
				ab.search(newCompanyString);

				break;

			case "6":
				//TestUser();
		
				//SaveRecords("in.txt", pContact.toString(), true);
				
					
				System.out.println("Testing u initiated the method");
				break;
				
				

			default:// default enter stop if needed to close program
				userInput = stringInput.nextLine();
				if (userInput.equals("stop")) {
					exitWhile = false;
					System.out.println("you have left the program thankyou!");
				}
				break;
			}
		}
	}


}