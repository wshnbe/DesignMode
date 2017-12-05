package com.DesignMode.status;

public class RunningStatus extends LiftState{

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void run() {
		System.out.println("电梯运行...");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stop);
		super.context.getLiftState().stop();
	}
}
