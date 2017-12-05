package com.DesignMode.review.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyTest implements InvocationHandler{
	
	private Object obj = null;
	
	public ProxyTest(Object obj){
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}
}
