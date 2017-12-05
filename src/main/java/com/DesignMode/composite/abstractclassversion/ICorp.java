package com.DesignMode.composite.abstractclassversion;

public abstract class ICorp {

	private String name;
	private String position;
	private int salary;
	
	public ICorp(String _name,String _position,int _salary){
		this.name = _name;
		this.position = _position;
		this.salary = _salary;
	}
	
	public String getInfo() {
		String info = "";
		info = "name :" +this.name;
		info = info + "\tposition:" +this.position;
		info = info + "\tsalary:" + this.salary;
		return info;
	}
}
