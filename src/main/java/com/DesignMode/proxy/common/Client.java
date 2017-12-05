package com.DesignMode.proxy.common;

/**
 * common proxy mode define
 * @author wulinli
 *
 */
public class Client {

	public static void main(String[] args) {		
		IHomeWorkCommon proxy = new HomeWorkProxy("zhangsan");
		proxy.homeWorkName();
		proxy.doHomeWork();
		proxy.clearHomeWork();
	}
}
