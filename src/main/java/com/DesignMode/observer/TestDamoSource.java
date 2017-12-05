package com.DesignMode.observer;

/**
 * 监听器/观察者模式
 * @author wulinli
 *
 */
public class TestDamoSource {

	DamoSource ds; 
	public TestDamoSource(){
		ds = new DamoSource(); 
		DamoListenerIns listenerIns = new DamoListenerIns();
		ds.addListener(listenerIns);
		ds.addListener(new DamoListener() {
			public void handlerEvent(DamoEvent event) {
				System.out.println("内部类事件处理..!");
			}
		});
		ds.notifyListener();
	}
	
	public static void main(String[] args) {
		new TestDamoSource();
	}
}
