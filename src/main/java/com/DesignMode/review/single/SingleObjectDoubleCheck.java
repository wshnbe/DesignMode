package com.DesignMode.review.single;

/**
 * 延迟加载 和 线程安全都符合
 * 
 * 双重校验模式
 * @author wulinli
 *
 */
public class SingleObjectDoubleCheck {

	private volatile static SingleObjectDoubleCheck single = null;
	private SingleObjectDoubleCheck(){}
	public static SingleObjectDoubleCheck getSingleObjectDoubleCheck(){
		if(single == null ){
			synchronized(SingleObjectDoubleCheck.class){
				if(single == null ){
					single = new SingleObjectDoubleCheck();
				}
			}
		}
		return single;
	}
	
}
