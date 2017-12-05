package com.DesignMode.status;

public class Context {

	public final static OpenningStatus open = new OpenningStatus();
	public final static ClosingStatus close = new ClosingStatus();
	public final static RunningStatus run = new RunningStatus();
	public final static StoppingStatus stop = new StoppingStatus();
	
	private LiftState liftState;
	
	public LiftState getLiftState(){
		return liftState;
	}
	
	public void setLiftState(LiftState liftState){
		this.liftState = liftState;
		this.liftState.setContext(this);
	}
	
	public void open(){
		this.liftState.open();
	}
	
	public void close(){
		this.liftState.close();
	}
	
	public void run(){
		this.liftState.run();
	}
	
	public void stop(){
		this.liftState.stop();
	}
}
