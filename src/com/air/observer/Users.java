package com.air.observer;

import com.info.beans.Customers;

public class Users implements Observer{

	@Override
	public void notifyUser(String msg, String userName) {
		// TODO Auto-generated method stub
		System.out.println("******"+msg+" "+userName+" **********");
	}

	@Override
	public void registerUser(Customers customers) {
		// TODO Auto-generated method stub
		System.out.println("******Customer Registered "+ customers.getName()+"******");
	}
	
	
	

}
