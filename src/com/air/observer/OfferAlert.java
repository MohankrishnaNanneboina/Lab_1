package com.air.observer;

import com.info.beans.Customers;

public class OfferAlert {
	
	
   Users users = new Users();
   
   public void RegisterUser(Customers customer) {
	   users.registerUser(customer);
   }
   
   public void sendOfferNotification(Customers customer) {
	   users.notifyUser(" Birthday cake offer - Up to 5% off, Code BDCAKE - birthdayCake.com ,", customer.getName());
   }
   


}
