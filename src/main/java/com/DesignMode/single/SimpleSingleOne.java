package com.DesignMode.single;

/**
 * 简单粗暴型--单利线程安全的模式
 * @author wulinli
 *
 */
public class SimpleSingleOne {

	private static final SimpleSingleOne single = new SimpleSingleOne();
	
	public static SimpleSingleOne getInstance(){
		return single;
	}
}
