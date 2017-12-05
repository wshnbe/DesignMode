package com.DesignMode.review.observer;

import java.util.Vector;

/**
 * 被观察者的类
 * observerable
 * @author wulinli
 *
 */
public class Player implements IPlayer{

	private Vector<ISpy> spys = new Vector<ISpy>(); 
	
	public void showMessage(String message){
		System.out.println("玩家1:"+message);
		notification(message);
	}
	
	public void addSpy(ISpy spy) {
		this.spys.add(spy);
	}

	public void deleteSpy(ISpy spy) {
		this.spys.remove(spy);
	}

	public void notification(String str) {
		if(spys.size() != 0){
			for(ISpy s : spys){
				s.update(str);
			}
		}
	}
}
