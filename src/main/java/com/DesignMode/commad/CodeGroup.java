package com.DesignMode.commad;

public class CodeGroup extends Group{

	@Override
	public void find() {
		System.out.println("find codeGroup");
	}

	@Override
	public void add() {
		System.out.println("codeGroup add");
	}

	@Override
	public void delete() {
		System.out.println("codeGroup delete");
	}

	@Override
	public void change() {
		System.out.println("codeGroup change");
	}

	@Override
	public void plan() {
		System.out.println("codeGroup plan");
	}
}
