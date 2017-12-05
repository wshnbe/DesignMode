package com.DesignMode.responsibilitychain;

public class Husband extends Handler{

	public Husband() {
		super(Handler.HUSBAND_LEVEL);
	}

	
	@Override
	protected void reponse(IWomen woman) {
		System.out.println("---------妻子向丈夫请求------");
		System.out.println(woman.getRequest());
		System.out.println("丈夫回复:同意");
	}
}
