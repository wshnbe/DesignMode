package com.DesignMode.decorator;

public class SortSchoolReport extends Decorator{

	public SortSchoolReport(SchoolReport schoolReport) {
		super(schoolReport);
	}

	private void sortReport(){
		System.out.println("在学校排名:20");
	}
	
	public void report(){
		super.report();
		sortReport();
	}
}
