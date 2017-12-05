package com.DesignMode.facade;

public class Client {

	public static void main(String[] args) {
		ILetter letter = new ZhangSanLetterImpl();
		letter.writeContent("哈哈");
		letter.addAddress("行唐县");
		letter.putIn();
		letter.send();
		
		/* 使用门面模式后 */
		FacadeLetter fl = new FacadeLetter();
		fl.sendLetter("哈哈", "行唐县");
	}
}
