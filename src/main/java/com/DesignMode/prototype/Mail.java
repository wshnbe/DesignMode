package com.DesignMode.prototype;

/**
 * prototype mode main code 
 * class implements interface {@link #Cloneable}
 * @author wulinli
 *
 */
public class Mail implements Cloneable{

	private String receiver;
	private String subject;
	private String appellation;
	private String context;
	private String tail;
	
	public Mail(AdvTemplate template){
		this.context = template.getAdcContext();
		this.subject = template.getAdvSubject();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAppellation() {
		return appellation;
	}

	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	/**
	 * prototype mode 
	 * main code
	 */
	@Override
	protected Object clone(){
		Mail mail = null;
		try {
			mail = (Mail)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mail;
	}
}
