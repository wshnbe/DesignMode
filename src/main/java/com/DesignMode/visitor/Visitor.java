package com.DesignMode.visitor;

public class Visitor implements IVisitor{

	public void visit(CommonEmployee employee) {
		System.out.println(getBaseInfo(employee));
	}

	public void visit(Manager manager) {
		System.out.println(getBaseInfo(manager));
	}
	
	private String getBaseInfo(Employee employee){
		String info = "姓名:" + employee.getName() + "\t";
		info = info + "性别:" + (employee.getSex() == Employee.MALE ?"男" : "女") + "\t";
		info = info + "薪水:" + employee.getSalary() + "\t";
		return info ;
	}
}
