package com.DesignMode.review.proxy;

public class Tester implements ITest{

	private String name ;
	
	public Tester(String name){
		this.name = name;
	}
	
	public void showMessage() {
		System.out.println("这是："+name);
	}

	public void Test() {
		System.out.println("test："+name);
	}
}
