package com.DesignMode.proxy.dynamicproxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyUp {
	
	@SuppressWarnings("unchecked")
	public static <T> T newProxyInstance(Object obj){
		if(true){
			new BeforeAdvice().exec();
		}
		InvocationHandler handler = new MyProxy(obj);
		ClassLoader loader = obj.getClass().getClassLoader();
		return (T)Proxy.newProxyInstance(loader, obj.getClass().getInterfaces(),handler);
	}
}
