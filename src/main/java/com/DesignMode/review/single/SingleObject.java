package com.DesignMode.review.single;

/**
 * 这是最简单的单利模式
 * 高并发情况下会出现错误
 * @author wulinli
 *
 */
public class SingleObject {

	private static SingleObject single = null;
	
	private SingleObject(){}
	
	public static SingleObject getSingle(){
		if(single == null){
			single = new SingleObject();
		}
		return single;
	}
}
