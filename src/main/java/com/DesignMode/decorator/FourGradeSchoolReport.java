package com.DesignMode.decorator;

public class FourGradeSchoolReport implements SchoolReport{

	public void report() {
		System.out.println("这是你的成绩:语文,60;数据,60");
	}

	public void sign(String name) {
		System.out.println(name+",家长签字...");
	}

}
