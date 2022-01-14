package com.air.observer;

import com.info.beans.Customers;

public interface Observer {
	
	public void registerUser(Customers customers);
	
	public void notifyUser(String msg,String playerName);

}
