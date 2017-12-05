package com.DesignMode.factory.abstractfactory;

public abstract class AbstractWhiteHuman implements Human{

	public void getColor() {
		System.out.println("这是白人的颜色.");
	}

	public void talk() {
		System.out.println("这是白人说的话.");
	}

}
