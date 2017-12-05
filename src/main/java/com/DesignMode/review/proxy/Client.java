package com.DesignMode.review.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		Tester test = new Tester("高欢");
		InvocationHandler proxy = new ProxyTest(test);
		ClassLoader cl = test.getClass().getClassLoader();
		
		ITest p = (ITest)Proxy.newProxyInstance(cl,new Class[]{ITest.class},proxy);
		p.showMessage();
		p.Test();
	}
}
