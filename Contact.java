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
	
}