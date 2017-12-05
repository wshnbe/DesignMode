package com.DesignMode.proxy;

/**
 * 这是代理模式的定义
 * 使用者
 * @author wulinli
 *
 */
public class Client {

	public static void main(String[] args) {
		/* 创建要做作业的人 */
		ZhangSanHomeWork zhangsan = new ZhangSanHomeWork();
		/* 创建一个代理来做 */
		HomeWorkProxy proxy = new HomeWorkProxy(zhangsan);
		
		proxy.HomeWorkName();
		proxy.doHomeWork();
		proxy.clearHomeWork();
	}
}
