package com.addressbookproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Collection<PersonalInfo> contactBook = new ArrayList<PersonalInfo>();
		Scanner scanI = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);
		
		 contactBook.add(new PersonalInfo("Rahul", "Roy", 9812345675l, "rahulroy20@xyz.com", "Bangalore", "Karnataka", 563322));
	        contactBook.add(new PersonalInfo("Lavanya", "Dhariyal", 970047875l, "lavanya2@abc.com", "Pune", "Maharashtra", 441222));
	        contactBook.add(new PersonalInfo("Sachin", "Bhatt", 9812345875l, "sachinbhatt1@xyz.com", "Mangalore", "Karnataka", 563322));
	        contactBook.add(new PersonalInfo("Aditya", "Agarwal", 9812347875l, "agarwal_aditya@abc.com", "Mathura", "UttarPradesh", 441222));

	        Iterator<PersonalInfo> personalInfoIterator = contactBook.iterator();

	        while (personalInfoIterator.hasNext()) {
	            System.out.println(personalInfoIterator.next());
	        }
		int ch;
		do {
			System.out.println("1.Add a new contact to your address book.");
			System.out.println("2.Edit a contact from your address book.");
			System.out.println("3.Print a contact from your address book.");
			System.out.println("Enter your Choice : ");
			ch = scanI.nextInt();

			switch (ch) {
			case 1:
				contactBook.add(Contact.addPerson());
				break;
			case 2:
				contactBook.add(Contact.editContact());
				break;

			case 3:
				System.out.println(".............");
				Iterator<PersonalInfo> personalInfoIteratorDisplay = contactBook.iterator();

				while (personalInfoIteratorDisplay.hasNext()) {
					System.out.println(personalInfoIteratorDisplay.next());
				}

				break;
			}

		} while (ch != 0);
	}

}
