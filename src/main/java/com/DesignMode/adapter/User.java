package com.DesignMode.adapter;

public class User implements IUserInfo{

	public String getName() {
		System.out.println("name's info is ...");
		return null;
	}

	public String getAddressInfo() {
		System.out.println("china hebei shijiazhuang");
		return null;
	}

	public String getFamiliyInfo() {
		System.out.println("familiy's info");
		return null;
	}
}
