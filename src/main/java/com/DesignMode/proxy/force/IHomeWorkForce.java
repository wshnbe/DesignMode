package com.DesignMode.proxy.force;

/**
 * force proxy
 * top design
 * @author wulinli
 *
 */
public interface IHomeWorkForce {

	public void homeWorkName();
	public void doHomeWork();
	public void clearHomeWork();
	/* add method to get proxy */
	public IHomeWorkForce getProxy();
}
