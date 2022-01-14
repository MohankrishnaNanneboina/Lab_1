package com.info.service;

public class WithExtraButter extends CakeDecorator {
 
	Cake cake;
	
	public WithExtraButter(Cake cake) {
		this.cake = cake;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return cake.getDescription()+" , With Extra Butter ";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return cake.cost()+ 4.5;
	}
	
	

}
