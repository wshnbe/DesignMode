package com.DesignMode.proxy.proxyextend;


public class HomeWorkProxy extends IHomeWorkExtend implements IProxy{

	private String name;
	IHomeWorkExtend zhangsan;
	
	public HomeWorkProxy(String homeworkerName,String proxyName){
		zhangsan = new ZhangSan(homeworkerName);
		this.name = proxyName;
	}
	
	public void getProxyName() {
		System.out.println("proxy name is :"+name);
	}

	@Override
	public void homeWorkName() {
		zhangsan.homeWorkName();
	}

	@Override
	public void doHomeWork() {
		zhangsan.doHomeWork();
	}

	@Override
	public void clearHomeWork() {
		zhangsan.clearHomeWork();
		this.getProxyName();
	}

}
