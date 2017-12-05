package com.DesignMode.proxy.proxyextend;

public class ZhangSan extends IHomeWorkExtend {

	private String name ;
	
	public ZhangSan(String name){
		this.name = name;
	}
	
	@Override
	public void homeWorkName() {
		System.out.println("name:"+name);
	}

	@Override
	public void doHomeWork() {
		System.out.println("this is my homework!");
	}

	@Override
	public void clearHomeWork() {
		System.out.println("homework is clear");
	}
}
