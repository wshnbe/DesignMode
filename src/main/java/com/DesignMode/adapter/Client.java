package com.DesignMode.adapter;

public class Client {

	public static void main(String[] args) {
		IUserInfo girl = new OuterUserInfo();
		System.out.println(girl.getName());
		System.out.println(girl.getAddressInfo());
		System.out.println(girl.getFamiliyInfo());
	}
}
