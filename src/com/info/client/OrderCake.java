package com.info.client;

import com.air.observer.OfferAlert;
import com.info.beans.Customers;
import com.info.service.Cake;
import com.info.service.ChocolateCake;
import com.info.service.WithExtraButter;
import com.info.service.WithExtraEggs;

public class OrderCake {
	
	public static void main(String[] args) {
		
		//Register User 
		Customers c1 = new Customers("Adam Gilchrist", 986629202);
		OfferAlert alert = new OfferAlert();
		alert.RegisterUser(c1);
		
		Cake chocolateCake = new ChocolateCake();
		previewOrder(chocolateCake);
		
		chocolateCake = new WithExtraEggs(chocolateCake);
		previewOrder(chocolateCake);
		
		chocolateCake = new WithExtraButter(chocolateCake);
		previewOrder(chocolateCake);
		
		//Send Offer Notification to the registered user using Observer Pattern 
		alert.sendOfferNotification(c1);

		
	}
	
	private static void previewOrder(Cake c) {
	    System.out.println("Cost: " + c.cost() + "$, Description: " + c.getDescription());
	}
	
	

}
