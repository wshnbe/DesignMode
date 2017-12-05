package com.DesignMode.factory.singletonfactory;

public class Client {

	public static void main(String[] args) {
		Singleton single = SingletonFactory.getSingleton();
		single.doSomething();
	}
}
