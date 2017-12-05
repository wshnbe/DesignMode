package com.DesignMode.bridge;

public class IPod extends Product{

	@Override
	public void beProducted() {
		System.out.println("山寨ipod是这样造出来的...");
	}

	@Override
	public void beSelled() {
		System.out.println("山寨ipod这样就卖出去了...");
	}
}
