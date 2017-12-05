package com.DesignMode.visitor;

public interface IVisitor {

	public void visit(CommonEmployee employee);
	public void visit(Manager manager);
}
