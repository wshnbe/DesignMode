package com.DesignMode.proxy.dynamicproxy.aop;

public class BeforeAdvice implements IAdvice{

	public void exec() {
		System.out.println("this is previous advice.");
	}
	
}
