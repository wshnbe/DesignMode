package com.DesignMode.responsibilitychain;

public class Woman implements IWomen{

	private int type;
	private String request  = null;
	
	public Woman(int type,String _request){
		this.request = _request;
		this.type = type;
		switch (this.type) {
		case 1:
			this.request = "女儿的请求是:"+request;
			break;
		case 2:
			this.request = "妻子的请求是:"+request;
			break;
		case 3:
			this.request = "母亲的请求是:"+request;
			break;
		default:
			break;
		}
	}
	
	public int getType() {
		return this.type;
	}

	public String getRequest() {
		return this.request;
	}
}
