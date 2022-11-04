package com.addressbookproject;

public class PersonalInfo {
	private String fName;
	private String lName;
	private long phoneNumber;
	private String email;
	private String state;
	private String city;
	private int zipCode;

	public PersonalInfo() {
		super();
	}

	public PersonalInfo(String fName, String lName, long phoneNumber, String email, String state, String city,
			int zipCode) {
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	public PersonalInfo(String state, String city, int zipCode) {
		super();
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	public PersonalInfo(String email) {
		super();
		this.email = email;
	}

	public PersonalInfo(long phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public int getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "PersonalInfo{" + "fName='" + fName + '\'' + ", lName='" + lName + '\'' + ", phoneNumber=" + phoneNumber
				+ ", email='" + email + '\'' + ", state='" + state + '\'' + ", city='" + city + '\'' + ", zipCode="
				+ zipCode + '}';
	}

}
