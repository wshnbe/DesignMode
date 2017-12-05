package com.DesignMode.factory.abstractfactory;

public abstract class AbstractBlackHuman implements Human{

	public void getColor(){
		System.out.println("这是黑人的颜色.");
	}
	
	public void talk(){
		System.out.println("black human language.");
	}
}
