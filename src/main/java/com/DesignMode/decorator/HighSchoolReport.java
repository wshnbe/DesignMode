package com.DesignMode.decorator;

public class HighSchoolReport extends Decorator{

	public HighSchoolReport(SchoolReport schoolReport) {
		super(schoolReport);
	}

	private  void reportHighSchoolReport(){
		System.out.println("语文总分:70,数学总分:70");
	}
	
	public void report(){
		this.reportHighSchoolReport();
		super.report();
	}
}
