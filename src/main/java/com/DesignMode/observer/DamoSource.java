package com.DesignMode.observer;

import java.util.Enumeration;
import java.util.Vector;

public class DamoSource {

	public DamoSource(){}
	private Vector<DamoListener> listeners = new Vector<DamoListener>();	
	
	public void addListener(DamoListener listener){
		listeners.add(listener);
	}
	
	public void notifyListener(){
		Enumeration<DamoListener> enums = listeners.elements();
		while(enums.hasMoreElements()){
			DamoListener listener = enums.nextElement();
			listener.handlerEvent(new DamoEvent(this));
		}
	}
}
