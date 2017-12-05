package com.DesignMode.single;

/**
 * 适合高并发情况下的单利模式
 * @author wulinli
 *
 */
public class SingleOne {

	private SingleOne single = null;
	private SingleOne(){}
	
	public synchronized SingleOne getInstance(){
		if(single == null){
			single = new SingleOne();
			return single;
		}
		return single;
	}
}
