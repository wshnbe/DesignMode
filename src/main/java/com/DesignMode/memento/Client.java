package com.DesignMode.memento;

/**
 * 备忘录模式
 * @author wulinli
 *
 */
public class Client {

	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.setState("心情很好!");
		System.out.println("现在男孩的状态:"+boy.getState());
		CareTaker taker = new CareTaker();
		taker.setMemento(boy.createMemento());

		boy.changeState();
		System.out.println("=============被拒后心态===========");
		System.out.println("现在的心态是:"+boy.getState());
		System.out.println("=============恢复后心态===========");
		boy.restoreMemeto(taker.getMemento());
		System.out.println(boy.getState());
	}
}
