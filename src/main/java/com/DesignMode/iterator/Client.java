package com.DesignMode.iterator;

public class Client {

	public static void main(String[] args) {
		IProject project = new Project();
		project.add("孔子", 10, 1000);
		project.add("孟子", 20, 2000);
		project.add("老子", 30, 3000);
		
		IProjectIterator iterator = project.iterator();
		while(iterator.hasNext()){
			IProject p = (IProject)iterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
