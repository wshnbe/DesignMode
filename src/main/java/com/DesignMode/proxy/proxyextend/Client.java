package com.DesignMode.proxy.proxyextend;

public class Client {

	public static void main(String[] args) {
		String name = "zhangsan";
		String proxyName = "lisi";
		
		IHomeWorkExtend proxy = new HomeWorkProxy(name, proxyName);
		proxy.homeWorkName();
		proxy.doHomeWork();
		proxy.clearHomeWork();
	}
}
