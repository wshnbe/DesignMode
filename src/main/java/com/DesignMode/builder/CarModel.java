package com.DesignMode.builder;

import java.util.ArrayList;

public abstract class CarModel {

	private ArrayList<String> sequeue = new ArrayList<String>();
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	final public void run(){
		for(int i=0;i<sequeue.size();i++){
			String actionName = sequeue.get(i);
			if(actionName.equals("start")){
				this.start();
			}else if(actionName.equals("stop")){
				this.stop();
			}else if(actionName.equals("alarm")){
				this.alarm();
			}
		}
	}
	
	final public void setSequeue(ArrayList<String> sequeue){
		this.sequeue =sequeue;
	}
}
