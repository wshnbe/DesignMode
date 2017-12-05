package com.DesignMode.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator{

	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	private int currentItem = 0;
	
	public ProjectIterator(ArrayList<IProject> projectList){
		this.projectList = projectList;
	}
	
	public boolean hasNext() {
		boolean f = true;
		if(this.currentItem >= projectList.size() || this.projectList.get(currentItem) == null)
			f = false;
		return f;
	}

	public IProject next() {
		return projectList.get(currentItem++);
	}

	public void remove() {
		
	}

}
