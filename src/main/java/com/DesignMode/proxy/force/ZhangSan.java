package com.DesignMode.proxy.force;

/**
 * real performer class
 * @author wulinli
 *
 */
public class ZhangSan implements IHomeWorkForce{

	private String name;
	private IHomeWorkForce proxy = null;
	
	public ZhangSan(String name){
		this.name = name;
	}
	
	public void homeWorkName() {
		if(!this.isProxy()){
			System.out.println("please visit the agent..");
		}else{			
			System.out.println("name:"+name);
		}
	}

	public void doHomeWork() {
		if(!this.isProxy()){			
			System.out.println("please visit the agent..");
		}else{
			System.out.println("this is my homework");
		}
	}

	public void clearHomeWork() {
		if(!this.isProxy()){
			System.out.println("please visit the agent");
		}else{			
			System.out.println("clear homework");
		}
	}

	public IHomeWorkForce getProxy() {
		proxy = new HomeWorkProxy(this);
		return proxy;
	}
	
	public boolean isProxy(){
		if(this.proxy == null){
			return false;
		}
		return true;
	}
}
