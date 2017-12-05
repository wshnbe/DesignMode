package com.DesignMode.proxy.force;

/**
 * force proxy 
 * @author wulinli
 *
 */
public class Client {

	public static void main(String[] args) {
		ZhangSan zhangsan = new ZhangSan("zhangsan");
		zhangsan.homeWorkName();
		zhangsan.doHomeWork();
		zhangsan.clearHomeWork();
		
		IHomeWorkForce proxy = zhangsan.getProxy();
		proxy.homeWorkName();
		proxy.doHomeWork();
		proxy.clearHomeWork();
	}
}
