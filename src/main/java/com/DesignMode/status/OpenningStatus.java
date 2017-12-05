package com.DesignMode.status;

public class OpenningStatus extends LiftState{

	@Override
	public void open() {
		System.out.println("电梯门开启...");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.close);
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void stop() {
		
	}
}
