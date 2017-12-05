package com.DesignMode.facade;

public class ZhangSanLetterImpl implements ILetter{

	public void writeContent(String content) {
		System.out.println("这是信的内容:我是张三."+content);
	}

	public void addAddress(String addree) {
		System.out.println("邮递到中国石家庄!"+addree);
	}

	public void putIn() {
		System.out.println("放入信封!");
	}

	public void send() {
		System.out.println("邮递啦!");
	}

}
