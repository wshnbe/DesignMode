package com.DesignMode.decorator;

public class Parent {

	public static void main(String[] args) {
		/* 原装成绩单 */
		SchoolReport report = new FourGradeSchoolReport();
		report = new HighSchoolReport(report);
		report = new SortSchoolReport(report);
		report.report();
		report.sign("胡汉三");
	}
}
