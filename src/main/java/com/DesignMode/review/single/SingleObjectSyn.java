package com.DesignMode.review.single;

/**
 * 高并发情况下线程安全的单利模式
 * 
 * 懒汉模式
 * @author wulinli
 *
 */
public class SingleObjectSyn {

	private static SingleObjectSyn syn = null;
	
	private SingleObjectSyn(){}
	
	public static synchronized SingleObjectSyn getSingleObjectSyn(){
		if(syn == null){			
			syn = new SingleObjectSyn();
		}
		return syn;
	}
}
