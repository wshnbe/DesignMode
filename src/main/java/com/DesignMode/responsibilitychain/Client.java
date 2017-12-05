package com.DesignMode.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		IWomen woman = new Woman(3,"出去逛街");
		Father father = new Father();
		Husband husband = new Husband();
		Son son = new Son();
		father.setNext(husband);
		husband.setNext(son);
		father.handlerMessage(woman);
	}
}
