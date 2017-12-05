package com.DesignMode.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		for(Employee emp:getList()){
			emp.accept(new Visitor());
		}
	}
	
	public static List<Employee> getList(){
		List<Employee> list = new ArrayList<Employee>();
		
		CommonEmployee zhangsan = new CommonEmployee();
		zhangsan.setJob("coder 代码的搬运工.");
		zhangsan.setName("zhangsan");
		zhangsan.setSalary(18000);
		zhangsan.setSex(Employee.MALE);
		list.add(zhangsan);
		
		Manager lisi = new Manager();
		lisi.setName("lisi");
		lisi.setPerformance("看着他们");
		lisi.setSalary(30000);
		lisi.setSex(Employee.MALE);
		list.add(lisi);
		
		return list;
	}
}
