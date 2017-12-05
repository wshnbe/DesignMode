package com.DesignMode.review.single;

/**
 * 这是线程安全的单利模式，它利用classLoader的单线程加载机制保证SingleObjectInner的单利
 * 符合线程安全，也符合延迟加载
 * 
 * 静态内部类模式
 * @author wulinli
 *
 */
public class SingleObjectInner {

	private static class SingleObjectHelper{
		public static SingleObjectInner single = new SingleObjectInner();
	}
	private SingleObjectInner(){}
	
	public static SingleObjectInner getSingleObjectHelper(){
		return SingleObjectHelper.single;
	}
}
