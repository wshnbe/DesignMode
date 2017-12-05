package com.DesignMode.proxy.dynamicproxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{

	private Object obj;
	
	public MyProxy(Object obj){
		this.obj = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(this.obj, args);
	}

}
