package com.DesignMode.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HomeWorkIH implements InvocationHandler{

	Object obj = null;
	
	public HomeWorkIH(Object obj){
		this.obj = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(this.obj, args);
		return result;
	}

}
