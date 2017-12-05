package com.DesignMode.factory.abstractfactory;

public class FemaleFactory implements HumanFactory{

	public Human createWhite() {
		return new FemaleWhiteHuman();
	}

	public Human createBlack() {
		return new FemaleBlackHuman();
	}

	public Human createYellow() {
		return new FemaleYellowHuman();
	}
}
