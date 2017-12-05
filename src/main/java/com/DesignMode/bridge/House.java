package com.DesignMode.bridge;

public class House extends Product{

	@Override
	public void beProducted() {
		System.out.println("房子是这样造出来的...");
	}

	@Override
	public void beSelled() {
		System.out.println("房子就这样卖出去了...");
	}
}
