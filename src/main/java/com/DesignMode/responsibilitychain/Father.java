package com.DesignMode.responsibilitychain;

public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL);
	}

	@Override
	protected void reponse(IWomen woman) {
		System.out.println("------女儿向父亲请求---------");
		System.out.println(woman.getRequest());
		System.out.println("父亲的答复:同意");
	}
}
