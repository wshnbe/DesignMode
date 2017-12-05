package com.DesignMode.bridge;

public class IPodCorp extends Corp{

	public IPodCorp(Product product) {
		super(product);
	}

	public void makeMoney(){
		super.makeMoney();
		System.out.println("山寨工厂也赚钱呀...");
	}
}
