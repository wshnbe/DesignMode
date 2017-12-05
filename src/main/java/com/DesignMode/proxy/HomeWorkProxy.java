package com.DesignMode.proxy;

/**
 * 代理
 * @author wulinli
 *
 */
public class HomeWorkProxy implements IHomeWork{

	private IHomeWork homeWork;

	public HomeWorkProxy(IHomeWork homeWork){
		this.homeWork = homeWork;
	}
	
	public void HomeWorkName() {
		homeWork.HomeWorkName();
	}

	public void doHomeWork() {
		homeWork.doHomeWork();
	}

	public void clearHomeWork() {
		homeWork.clearHomeWork();
	}
	
}
