package com.DesignMode.review.observer;

public class Spyer implements ISpy{

	private String name;
	public Spyer(String name){
		this.name = name;
	}
	public void update(String str) {
		System.out.println(name+",收到玩家1的信息："+str);
	}
}
