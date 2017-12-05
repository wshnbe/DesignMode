package com.DesignMode.proxy;

/**
 * 真实执行者,被代理者
 * @author wulinli
 *
 */
public class ZhangSanHomeWork implements IHomeWork{

	public void HomeWorkName() {
		System.out.println("name:zhangsan");
	}

	public void doHomeWork() {
		System.out.println("this is my homework!");
	}

	public void clearHomeWork() {
		System.out.println("homework is over");
	}

}
