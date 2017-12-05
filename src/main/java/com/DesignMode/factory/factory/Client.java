package com.DesignMode.factory.factory;

public class Client {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		Human yellow = factory.createHuman(YellowHuman.class);
		Human white = factory.createHuman(WhiteHuman.class);
		Human black = factory.createHuman(BlackHuman.class);
		
		yellow.getColor();
		yellow.getTalk();
		
		white.getColor();
		white.getTalk();
		
		black.getColor();
		black.getTalk();
	}
}
