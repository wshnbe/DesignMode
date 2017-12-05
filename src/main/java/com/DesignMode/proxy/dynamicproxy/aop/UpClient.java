package com.DesignMode.proxy.dynamicproxy.aop;

public class UpClient {

	public static void main(String[] args) {
		IGamePlay player = new Player();
		IGamePlay proxy = DynamicProxyUp.newProxyInstance(player);
		proxy.login("zhangsan", "123456");
		proxy.killMonster();
		proxy.gradeUpdate();
	}
}
