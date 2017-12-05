package com.DesignMode.policy;

public class Add implements Operation{
	

	private int a;
	private int b;
	
	public Add(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public void getResult(){
		System.out.println("相加的结果是:"+(a+b));
	}
}
