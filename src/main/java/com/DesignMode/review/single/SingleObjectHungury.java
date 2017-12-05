package com.DesignMode.review.single;

/**
 * 通过classLoader机制保证 多线程时单利的安全性
 * 不符合：延迟加载
 * 饿汉模式
 * @author wulinli
 *
 */
public class SingleObjectHungury {

	private static SingleObjectHungury single = new SingleObjectHungury();
	private SingleObjectHungury(){}
	public static SingleObjectHungury getSingleObjectHungury(){
		return single;
	}
}
