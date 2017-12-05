package com.DesignMode.prototype;

public class Client {

	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		int i = 0 ;
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("xx is owner");
		while(i<MAX_COUNT){
			Mail cloneMail = (Mail) mail.clone();
			cloneMail.setAppellation("aaaa"+" sair");
			cloneMail.setReceiver("aaa@.com");
			sendMail(cloneMail);
			i++;
		}
	}
	
	public static void sendMail(Mail mail){
		System.out.println("subject :"+mail.getSubject()+"\t receiver:"+mail.getReceiver()+"\tsend success");
	}
}
