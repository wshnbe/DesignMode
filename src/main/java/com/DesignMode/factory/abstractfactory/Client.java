package com.DesignMode.factory.abstractfactory;

public class Client {

	public static void main(String[] args) {
		Human femaleWhite = new FemaleWhiteHuman();
		Human maleWhite = new MaleWhiteHuman();
		
		Human femaleBlack = new FemaleBlackHuman();
		Human maleBlack = new MaleBlackHuman();
		
		Human felmaleYellow = new FemaleYellowHuman();
		Human maleYellow = new MaleYellowHuman();
		
		femaleWhite.getColor();
		femaleWhite.getSex();
		maleWhite.getColor();
		maleWhite.getSex();
		
		femaleBlack.getColor();
		femaleBlack.getSex();
		maleBlack.getColor();
		maleBlack.getSex();
		
		felmaleYellow.getColor();
		felmaleYellow.getSex();
		maleYellow.getColor();
		maleYellow.getSex();
	}
}
