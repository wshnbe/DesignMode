package com.DesignMode.observer;

public class DamoListenerIns implements DamoListener{

	public void handlerEvent(DamoEvent event) {
		event.say();
	}
}
