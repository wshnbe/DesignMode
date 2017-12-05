package com.DesignMode.commad;

public class PageGroup extends Group{

	@Override
	public void find() {
		System.out.println("find pageGroup");
	}

	@Override
	public void add() {
		System.out.println("pageGroup add requirement");
	}

	@Override
	public void delete() {
		System.out.println("pageGroup delete requirement");
	}

	@Override
	public void change() {
		System.out.println("pageGroup change requirement");
	}

	@Override
	public void plan() {
		System.out.println("pageGroup plan");
	}
}
