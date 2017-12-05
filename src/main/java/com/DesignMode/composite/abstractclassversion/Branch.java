package com.DesignMode.composite.abstractclassversion;

import java.util.ArrayList;

public class Branch extends ICorp{

	ArrayList<ICorp> subList = new ArrayList<ICorp>();
	
	public Branch(String name,String position,int salary){
		super(name, position, salary);
	}

	public void addSub(ICorp corp) {
		this.subList.add(corp);
	}

	public ArrayList<ICorp> getSubList() {
		return this.subList;
	}
}
