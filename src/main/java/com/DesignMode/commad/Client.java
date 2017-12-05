package com.DesignMode.commad;

public class Client {

	public static void main(String[] args) {
		Command command = new AddCommand();
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
