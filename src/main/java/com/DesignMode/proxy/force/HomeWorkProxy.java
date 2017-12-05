package com.DesignMode.proxy.force;

/**
 * proxy class
 * @author wulinli
 *
 */
public class HomeWorkProxy implements IHomeWorkForce{

	IHomeWorkForce roler;
	
	public HomeWorkProxy(IHomeWorkForce roler){
		this.roler = roler;
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

	public IHomeWorkForce getProxy() {
		return this;
	}
}
