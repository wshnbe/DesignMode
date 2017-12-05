package com.DesignMode.bridge;

public class HouseCorp extends Corp{

	public HouseCorp(Product product) {
		super(product);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产公司赚大了...");
	}
}
