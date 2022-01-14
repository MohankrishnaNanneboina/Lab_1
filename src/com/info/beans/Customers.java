package com.info.beans;

public class Customers {
	
	private String name;
	
	private long ContactNumber;
	
	

	public Customers(String name, long contactNumber) {
		super();
		this.name = name;
		ContactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(long contactNumber) {
		ContactNumber = contactNumber;
	}
	

}
