package com.DesignMode.factory.singletonfactory;

import java.lang.reflect.Constructor;

@SuppressWarnings("rawtypes")
public class SingletonFactory {

	private static Singleton singleton ;
	
	static {
		try {
			Class cl = Class.forName(Singleton.class.getName());
			Constructor constructor = cl.getDeclaredConstructors()[0];
			constructor.setAccessible(true);
			singleton = (Singleton)constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Singleton getSingleton(){
		return singleton;
	}
}
