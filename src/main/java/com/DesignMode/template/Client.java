package com.DesignMode.template;

public class Client {

	public static void main(String[] args) {
		HummerModel1 model1 = new HummerModel1();
		HummerModel2 model2 = new HummerModel2();
		
		model1.run();
		model2.run();
	}
}
