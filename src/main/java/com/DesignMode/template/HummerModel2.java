package com.DesignMode.template;

public class HummerModel2 extends HummerModel{

	@Override
	public void start() {
		System.out.println("HummerModel2 start...");
	}

	@Override
	public void stop() {
		System.out.println("HummerModel2 stop...");
	}

	@Override
	public void alarm() {
		System.out.println("HummerModel2 alarm...");
	}
}
