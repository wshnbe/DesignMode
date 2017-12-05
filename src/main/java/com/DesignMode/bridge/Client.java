package com.DesignMode.bridge;

public class Client {

	public static void main(String[] args) {
		HouseCorp hCorp = new HouseCorp(new House());
		hCorp.makeMoney();
		IPodCorp iCorp = new IPodCorp(new IPod());
		iCorp.makeMoney();
	}
}
