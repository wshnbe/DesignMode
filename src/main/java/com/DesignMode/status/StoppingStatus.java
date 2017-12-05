package com.DesignMode.status;

public class StoppingStatus extends LiftState{

	@Override
	public void open() {
		super.context.setLiftState(Context.open);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.run);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		System.out.println("电梯停止...");
	}
}
