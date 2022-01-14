package com.info.service;

public class WithExtraEggs extends CakeDecorator {
   
	Cake cake;
	
	public WithExtraEggs(Cake cake) {
		this.cake= cake;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription() +", With Extra Eggs ";
	} 

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return cake.cost()+ 5.0;
	}

}
