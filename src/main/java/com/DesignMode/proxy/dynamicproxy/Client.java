package com.DesignMode.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		IHomeWorkDynamic zhangsan = new ZhangSan("zhang san");
		InvocationHandler handler = new HomeWorkIH(zhangsan);
		ClassLoader cl = zhangsan.getClass().getClassLoader();
		IHomeWorkDynamic proxy = (IHomeWorkDynamic)Proxy.newProxyInstance(cl,new Class[]{IHomeWorkDynamic.class}, handler);
		proxy.homeWorkName();
		proxy.doHomeWork();
		proxy.clearHomeWork();
	}
}
