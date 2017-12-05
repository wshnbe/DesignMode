package com.DesignMode.proxy.dynamicproxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	
	@SuppressWarnings("unchecked")
	public static <T> T newRroxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler handler){
		if(true){
			new BeforeAdvice().exec();
		}
		return (T)Proxy.newProxyInstance(loader, interfaces, handler);
	}
}
