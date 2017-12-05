package com.DesignMode.status;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new RunningStatus());
		
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
