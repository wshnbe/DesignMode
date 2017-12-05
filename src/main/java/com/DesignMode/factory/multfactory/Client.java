package com.DesignMode.factory.multfactory;

public class Client {

	public static void main(String[] args) {
		AbstractHumanFactory yellowFactory = new YellowHumanFactory();
		AbstractHumanFactory whiteFactory = new WhiteHumanFactory();
		AbstractHumanFactory blackFactory = new BlackHumanFactory();
		
		Human yellow = yellowFactory.createHuman();
		Human white = whiteFactory.createHuman();
		Human black = blackFactory.createHuman();
		
		yellow.getColor();
		yellow.getTalk();
		
		white.getColor();
		white.getTalk();
		
		black.getColor();
		black.getTalk();
	}
}
