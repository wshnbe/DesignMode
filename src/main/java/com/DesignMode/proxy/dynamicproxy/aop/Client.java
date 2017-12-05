package com.DesignMode.proxy.dynamicproxy.aop;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		/* real performer class*/
		IGamePlay player = new Player();
		/* create proxy handler*/
		InvocationHandler handler = new MyProxy(player);
		/* create proxy */
		ClassLoader loader = player.getClass().getClassLoader();
		IGamePlay proxy = DynamicProxy.newRroxyInstance(loader, new Class[]{IGamePlay.class}, handler);
		proxy.login("zhang san", "123456");
		proxy.killMonster();
		proxy.gradeUpdate();
	}
}
