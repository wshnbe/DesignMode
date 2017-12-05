package com.DesignMode.status;

public class ClosingStatus extends LiftState{

	@Override
	public void open() {
		super.context.setLiftState(Context.open);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.run);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stop);
		super.context.getLiftState().stop();
	}
}
