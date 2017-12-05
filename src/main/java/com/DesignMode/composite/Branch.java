package com.DesignMode.composite;

import java.util.ArrayList;

public class Branch implements IBranch{

	private String name = "";
	private String position = "";
	private int salary = 0;
	ArrayList<ICorp> subList = new ArrayList<ICorp>();
	
	public Branch(String name,String position,int salary){
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo() {
		String info = "";
		info = "name :" +this.name;
		info = info + "\tposition:" +this.position;
		info = info + "\tsalary:" + this.salary;
		return info;
	}

	public void addSub(ICorp corp) {
		this.subList.add(corp);
	}

	public ArrayList<ICorp> getSubList() {
		return this.subList;
	}
}
