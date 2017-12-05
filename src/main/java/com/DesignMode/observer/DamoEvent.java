package com.DesignMode.observer;

import java.util.EventObject;

@SuppressWarnings("serial")
public class DamoEvent extends EventObject{

	public DamoEvent(Object source) {
		super(source);
	}

	public void say(){
		System.out.println("这是触发的事件信息!");
	}
}
