package com.DesignMode.factory.lazyfactory;

import java.util.HashMap;
import java.util.Map;

public class ProjectFactory {

	private static final Map<String,IProject> prMap = new HashMap<String,IProject>();
	
	public static synchronized IProject createProject(String type)throws Exception{
		IProject project = null;
		if(prMap.containsKey(type)){
			project = prMap.get(type);
		}else{
			//具体的实现类的实例
			prMap.put(type, project);
		}
		return project;
	}
}
