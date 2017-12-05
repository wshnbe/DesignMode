package com.DesignMode.factory.simplefactory;

/**
 * 简单工厂模式的两种实现:
 * class方式
 * 字符串方式
 * @author wulinli
 *
 */
public class HumanFactory{

	@SuppressWarnings("unchecked")
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)human;
	}
	
	public static Human createHuman(String str){
		if(str.equals("white")){
			return new WhiteHuman();
		}else if(str.equals("black")){
			return new BlackHuman();
		}else if(str.equals("yellow")){
			return new YellowHuman();
		}else{
			return null;
		}
	}
}
