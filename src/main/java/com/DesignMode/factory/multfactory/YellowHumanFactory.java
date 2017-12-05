package com.DesignMode.factory.multfactory;

/**
 * 职责进行切分,每个工厂只能生产特定的类对象
 * @author wulinli
 *
 */
public class YellowHumanFactory extends AbstractHumanFactory{

	public Human createHuman() {
		return new YellowHuman();
	}
}
