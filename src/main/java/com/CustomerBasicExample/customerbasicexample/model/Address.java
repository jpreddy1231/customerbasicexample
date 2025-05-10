package com.CustomerBasicExample.customerbasicexample.model;

public class Address {
	int addressId;
	String location;
	long pinCode;
	

	
	
	public Address() {
		super();
	}




	public Address(int addressId, String location, long pinCode) {
		super();
		this.addressId = addressId;
		this.location = location;
		this.pinCode = pinCode;
	}




	public int getAddressId() {
		return addressId;
	}




	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public long getPinCode() {
		return pinCode;
	}




	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}




	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", location=" + location + ", pinCode=" + pinCode + "]";
	}

}
