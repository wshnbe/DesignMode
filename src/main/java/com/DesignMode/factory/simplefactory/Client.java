package com.DesignMode.factory.simplefactory;

public class Client {

	public static void main(String[] args) {
//		Human yellow = HumanFactory.createHuman(YellowHuman.class);
//		Human white = HumanFactory.createHuman(WhiteHuman.class);
//		Human black = HumanFactory.createHuman(BlackHuman.class);
		
		Human yellow = HumanFactory.createHuman("yellow");
		Human white = HumanFactory.createHuman("white");
		Human black = HumanFactory.createHuman("black");
		
		yellow.getColor();
		yellow.getTalk();
		
		white.getColor();
		white.getTalk();
		
		black.getColor();
		black.getTalk();
	}
}
