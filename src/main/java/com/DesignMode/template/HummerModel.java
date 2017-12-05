package com.DesignMode.template;

public abstract class HummerModel {

	public abstract void start();
	public abstract void stop();
	public abstract void alarm();
	
	public void run(){
		this.start();
		this.alarm();
		this.stop();
	}
}
