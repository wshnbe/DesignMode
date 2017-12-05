package com.DesignMode.responsibilitychain;

public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL);
	}

	@Override
	protected void reponse(IWomen woman) {
		System.out.println("母亲向儿子请求");
		System.out.println(woman.getRequest());
		System.out.println("儿子的回复:同意");
	}
}
