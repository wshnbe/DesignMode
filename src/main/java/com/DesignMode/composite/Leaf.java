package com.DesignMode.composite;

public class Leaf implements ILeaf{

	private String name = "";
	private String position = "";
	private int salary = 0;

	public Leaf(String name,String position,int salary){
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
}
