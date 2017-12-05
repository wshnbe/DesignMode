package com.DesignMode.factory.abstractfactory;

public class MaleFactory implements HumanFactory{

	public Human createWhite() {
		return new MaleWhiteHuman();
	}

	public Human createBlack() {
		return new MaleBlackHuman();
	}

	public Human createYellow() {
		return new MaleYellowHuman();
	}
}
