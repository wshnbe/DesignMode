package com.DesignMode.policy;

public class Mul implements Operation{

	private int a;
	private int b;
	
	public Mul(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public void getResult() {
		System.out.println("相减的结果是:"+(a-b));
	}
}
