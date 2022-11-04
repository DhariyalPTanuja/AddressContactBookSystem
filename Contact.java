package com.addressbookproject;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Contact {
	private static String fname;
	private static String lname;
	private static String email;
	private static String city;
	private static String state;
	private static long phoneNumber;
	private static int zipCode;
	static boolean found;

	public static PersonalInfo addPerson() {
		Scanner scanobj = new Scanner(System.in);
		System.out.println("Enter the User first name : ");
		fname = scanobj.next();
		System.out.println("Enter the User last name : ");
		lname = scanobj.next();
		System.out.println("Enter the User phone number : ");
		phoneNumber = scanobj.nextLong();
		System.out.println("Enter the User email : ");
		email = scanobj.next();
		System.out.println("Enter the city name : ");
		city = scanobj.next();
		System.out.println("Enter the state name : ");
		state = scanobj.next();
		System.out.println("Enter the zip code : ");
		zipCode = scanobj.nextInt();
		PersonalInfo p = new PersonalInfo(fname, lname, phoneNumber, email, city, state, zipCode);
		return p;
	}

	public static PersonalInfo editContact() {
		List<PersonalInfo> contactList = new ArrayList<PersonalInfo>();
		Scanner scanobj = new Scanner(System.in);
		found = false;
		System.out.println("enter the first and last name to update person detail:");
		fname = scanobj.next();
		lname = scanobj.next();
		System.out.println("-------------");
		ListIterator<PersonalInfo> list = contactList.listIterator();
		while (list.hasNext()) {
			PersonalInfo data = list.next();
			// if((data.getfName()== fname) && (data.getlName()==lname)) {
			if ((fname.equalsIgnoreCase(data.getfName())) && (lname.equalsIgnoreCase(data.getlName()))) {
				System.out.println("Enter choice to Update\s" + " Enter 1 for Edit Address "
						+ " Enter 2 for Edit PhoneNumber " + " Enter 3 for Edit Email addres ");
				int choice = scanobj.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter New City:");
					city = scanobj.next();
					System.out.println("Enter New State:");
					state = scanobj.next();
					System.out.println("Enter New Zip Code:");
					zipCode = scanobj.nextInt();
					list.set(new PersonalInfo(state, city, zipCode));
					break;
				case 2:
					System.out.println("Enter New Phone Number:");
					phoneNumber = scanobj.nextLong();
					list.set(new PersonalInfo(phoneNumber));
					break;

				case 3:
					System.out.println("Enter New Email Address:");
					email = scanobj.next();
					list.set(new PersonalInfo(email));
					break;
				}

				found = true;
			}
		}
		if (!found)
			System.out.println("Record Not Found!!!");
		else
			System.out.println("Updated Succesfully!!!");
		System.out.println("...............");

		return new PersonalInfo(fname, lname, phoneNumber, email, city, state, zipCode);

	}

	public static void deleteContact() {
		List<PersonalInfo> contactList = new ArrayList<PersonalInfo>();
		Scanner scanobj = new Scanner(System.in);
		found = false;
		System.out.println("enter the first name to delete person detail:");
		fname = scanobj.next();
		System.out.println("-------------");
		ListIterator<PersonalInfo> list = contactList.listIterator();
		while (list.hasNext()) {
			PersonalInfo data = list.next();
			if (data.getfName() == fname) {
				found = true;
				list.remove();
			}

		}

		if (!found)
			System.out.println("Record Not Found!!!");
		else
			System.out.println("Delete Succesfully!!!");
		System.out.println("...............");



	}

	

}