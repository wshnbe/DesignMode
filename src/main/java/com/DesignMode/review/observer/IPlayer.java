package com.DesignMode.review.observer;

public interface IPlayer {

	public void addSpy(ISpy spy);//添加间谍接口
	public void deleteSpy(ISpy spy); //删除间谍接口
	public void notification(String str); //通知间谍
}
