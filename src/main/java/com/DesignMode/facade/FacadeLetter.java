package com.DesignMode.facade;

/**
 *  门面模式:就是我们平时使用的对 对象的引用,在门面类的方法中对
 *  引用类的方法的组合.引用类也叫做:子系统
 * @author wulinli
 *
 */
public class FacadeLetter {

	ILetter letter = new ZhangSanLetterImpl();
	
	public void sendLetter(String content,String address){
		System.out.println("---------------这是新式写信方式-------");
		letter.writeContent(content);
		letter.addAddress(address);
		letter.putIn();
		letter.send();
	}
}
