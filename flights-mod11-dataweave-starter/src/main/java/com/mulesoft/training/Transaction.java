package com.mulesoft.training;

import java.util.Comparator;

public class Transaction implements java.io.Serializable, Comparable<Transaction> {
	
	String region;
	String amount;
	String transactionID;
	String customerRef;
	String flightID;
	
	public Transaction() {}
	
	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public String getTransactionID() {
		return transactionID;
	}



	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}



	public String getCustomerRef() {
		return customerRef;
	}



	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}



	public String getFlightID() {
		return flightID;
	}



	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}



	public Transaction(String region, String amount, String transactionID, String customerRef, String flightID) {
		super();
		this.region = region;
		this.amount = amount;
		this.transactionID = transactionID;
		this.customerRef = customerRef;
		this.flightID = flightID;
	}



	@Override
	public int compareTo(Transaction o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
