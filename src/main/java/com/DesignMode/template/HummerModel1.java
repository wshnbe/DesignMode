package com.DesignMode.template;

public class HummerModel1 extends HummerModel{

	@Override
	public void start() {
		System.out.println("HummerModel1 start...");
	}

	@Override
	public void stop() {
		System.out.println("HummerModel1 stop...");
	}

	@Override
	public void alarm() {
		System.out.println("HummerModel1 alarm...");
	}
}
