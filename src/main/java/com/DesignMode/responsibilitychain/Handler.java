package com.DesignMode.responsibilitychain;

public abstract class Handler {

	public final static int FATHER_LEVEL = 1;
	public final static int HUSBAND_LEVEL = 2;
	public final static int SON_LEVEL = 3;
	
	private int level = 0;
	private Handler nextHandler;
	
	public Handler(int _level){
		this.level = _level;
	}
	
	public final void handlerMessage(IWomen woman){
		if(woman.getType() == this.level){
			this.reponse(woman);
		}else{
			if(this.nextHandler != null){
				this.nextHandler.handlerMessage(woman);
			}else{
				System.out.println("不处理请求了,自己随意.");
			}
		}
	}
	
	public void setNext(Handler handler){
		this.nextHandler = handler;
	}
	
	protected abstract void reponse(IWomen woman);
}
