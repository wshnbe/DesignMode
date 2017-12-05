package com.DesignMode.builder;

import java.util.ArrayList;

/**
 * 制作不同类型的组合的模型
 * start,stop,alarm
 * @author wulinli
 *
 */
public class Director {
	private ArrayList<String> sequeue = new ArrayList<String>();
	private BCCarBuilder bcBuilder = new BCCarBuilder();
	private BMCarBuilder bmBuilder = new BMCarBuilder();
	
	public void getBCModelA(){
		this.sequeue.add("start");
		this.sequeue.add("stop");
		this.sequeue.add("alarm");
		bcBuilder.setSequeue(sequeue);
		bcBuilder.getCarModel().run();
	}
	
	public void getBCModelB(){
		this.sequeue.add("start");
		this.sequeue.add("alarm");
		this.sequeue.add("stop");
		bcBuilder.getCarModel().run();
	}
	
	public void getBMModelA(){
		this.sequeue.add("start");
		this.sequeue.add("alarm");
		this.sequeue.add("stop");
		bmBuilder.getCarModel().run();
	}
	
	public void getBMModelB(){
		this.sequeue.add("start");
		this.sequeue.add("stop");
		this.sequeue.add("alarm");
		bmBuilder.getCarModel().run();
	}
	
	public static void main(String[] args) {
		Director director = new Director();
		director.getBCModelA();
	}
	//.......不断的组合类型
}
