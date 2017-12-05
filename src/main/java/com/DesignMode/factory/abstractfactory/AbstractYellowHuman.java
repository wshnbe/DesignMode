package com.DesignMode.factory.abstractfactory;

public abstract class AbstractYellowHuman implements Human{

	public void getColor(){
		System.out.println("the color of yellow human.");
	}
	
	public void talk(){
		System.out.println("the language of yellow human.");
	}
}
