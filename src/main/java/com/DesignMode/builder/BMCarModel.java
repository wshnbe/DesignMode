package com.DesignMode.builder;

public class BMCarModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("bao ma car start..");
	}

	@Override
	protected void stop() {
		System.out.println("bao ma car stop...");
	}

	@Override
	protected void alarm() {
		System.out.println("bao ma car alarm...");
	}
}
