package com.DesignMode.factory.factory;

public abstract class AbstractHumanFactory {

	public abstract <T extends Human> T createHuman(Class<T> c);
	
	public abstract Human createHuman(String str);
}
