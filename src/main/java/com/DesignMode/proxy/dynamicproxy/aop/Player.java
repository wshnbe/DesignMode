package com.DesignMode.proxy.dynamicproxy.aop;

public class Player implements IGamePlay{

	public void login(String name, String password) {
		System.out.println("name:"+name+" is login");
	}

	public void killMonster() {
		System.out.println("kill monster.");
	}

	public void gradeUpdate() {
		System.out.println("grade update...");
	}
}
