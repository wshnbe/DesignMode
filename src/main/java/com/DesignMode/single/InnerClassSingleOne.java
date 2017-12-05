package com.DesignMode.single;

/**
 * 内部类形式的单利模式
 * @author wulinli
 *
 */
public class InnerClassSingleOne {

	private InnerClassSingleOne(){}
	
	private static class LasyHolder{
		private static final InnerClassSingleOne single = new InnerClassSingleOne();
	}
	
	public static InnerClassSingleOne getInstance(){
		return LasyHolder.single;
	}
}
