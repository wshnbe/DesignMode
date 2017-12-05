package com.DesignMode.iterator;

import java.util.ArrayList;

public class Project implements IProject{

	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	
	private String name;
	private int num = 0;
	private int cost = 0;
	
	public Project(){}
	
	public Project(String name,int num,int cost){
		this.name = name;
		this.num = num;
		this.cost = cost;
	}
	
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name, num, cost));
	}

	public String getProjectInfo() {
		String info = "";
		info = info + "项目名称是:" + this.name;
		info = info + "项目人数是:" + this.num;
		info = info + "项目花费是:" + this.cost;
		return info;
	}

	public IProjectIterator iterator() {
		return new ProjectIterator(projectList);
	}
}
