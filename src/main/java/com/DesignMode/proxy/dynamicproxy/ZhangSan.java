package com.DesignMode.proxy.dynamicproxy;

public class ZhangSan implements IHomeWorkDynamic{

	private String name;
	
	public ZhangSan(String name){
		this.name = name;
	}
	
	public void homeWorkName() {
		System.out.println("name:"+name);
	}

	public void doHomeWork() {
		System.out.println("this is my homework.");
	}

	public void clearHomeWork() {
		System.out.println("clear homework.");
	}
}
