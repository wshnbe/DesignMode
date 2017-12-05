package com.DesignMode.review.observer;

public class Client {

	public static void main(String[] args) {
		Player player = new Player();
		ISpy zhao = new Spyer("赵四");
		ISpy qian = new Spyer("钱钱");
		ISpy sun = new Spyer("孙子");
		player.addSpy(zhao);
		player.addSpy(qian);
		player.addSpy(sun);
		
		player.showMessage("开始攻城！！！！");
	}
}
