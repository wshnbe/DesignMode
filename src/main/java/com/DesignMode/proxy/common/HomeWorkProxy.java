package com.DesignMode.proxy.common;

/**
 * proxy class
 * @author wulinli
 *
 */
public class HomeWorkProxy extends IHomeWorkCommon{
	
	IHomeWorkCommon roler = null;
	public HomeWorkProxy(String name){
		try {
			roler = new ZhangSan(this, name);
		} catch (Exception e) {
			//do someting of exception
		}
	}

	public void homeWorkName() {
		roler.homeWorkName();
	}

	public void doHomeWork() {
		roler.doHomeWork();
	}

	public void clearHomeWork() {
		roler.clearHomeWork();
	}

}
