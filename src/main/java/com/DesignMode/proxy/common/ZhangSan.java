package com.DesignMode.proxy.common;

/**
 * real performer class
 * @author wulinli
 *
 */
public class ZhangSan extends IHomeWorkCommon{
	
	private String name;
	public ZhangSan(IHomeWorkCommon _common,String name)throws Exception{
		if(_common == null){
			throw new Exception("cannot create real roler!");
		}
		this.name = name;
	}
	
	public void homeWorkName() {
		System.out.println("name:"+name);
	}

	public void doHomeWork() {
		System.out.println("this is my homework");
	}

	public void clearHomeWork() {
		System.out.println("homework is clear");
	}

}
