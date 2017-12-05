package com.DesignMode.factory.factory;

/**
 * 工厂模式的两种实现:
 * class方式
 * 字符串方式
 * @author wulinli
 *
 */
public class HumanFactory extends AbstractHumanFactory{

	@Override
	@SuppressWarnings("unchecked")
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T)human;
	}
	
	@Override
	public Human createHuman(String str){
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
