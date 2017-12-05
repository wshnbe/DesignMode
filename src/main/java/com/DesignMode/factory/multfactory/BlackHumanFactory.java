package com.DesignMode.factory.multfactory;

/**
 * 职责进行切分,每个工厂只能生产特定的类对象
 * @author wulinli
 *
 */
public class BlackHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}
