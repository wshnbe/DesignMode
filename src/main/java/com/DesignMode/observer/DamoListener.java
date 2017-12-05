package com.DesignMode.observer;

import java.util.EventListener;

public interface DamoListener extends EventListener{

	public void handlerEvent(DamoEvent event);
}
