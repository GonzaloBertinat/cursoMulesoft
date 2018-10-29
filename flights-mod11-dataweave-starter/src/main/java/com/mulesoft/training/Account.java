package com.mulesoft.training;
import java.util.Comparator;

public class Account implements java.io.Serializable, Comparable<Account> {

	String city;
	String creationDate;
	String country;
	int miles;
	String state;
	String postal;
	String name;
	String accountType;
	String accountID;
	String street;
	
	public Account() {}
	
	public Account(String city, String creationDate, String country, int miles, String state, String postal,
			String name, String accountType, String accountID, String street) {
		this.city = city;
		this.creationDate = creationDate;
		this.country = country;
		this.miles = miles;
		this.state = state;
		this.postal = postal;
		this.name = name;
		this.accountType = accountType;
		this.accountID = accountID;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
