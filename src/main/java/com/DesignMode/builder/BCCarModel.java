package com.DesignMode.builder;

public class BCCarModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("ben chi car start...");
	}

	@Override
	protected void stop() {
		System.out.println("ben chi car stop...");
	}

	@Override
	protected void alarm() {
		System.out.println("ben chi car alarm...");
	}
}
