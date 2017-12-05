package com.DesignMode.policy;

public class Context {

	private Operation operation;
	
	public Context(Operation operation){
		this.operation = operation;
	}
	
	public void doIt(){
		this.operation.getResult();
	}
}
