package com.DesignMode.commad;

public class RequirementGroup extends Group{

	@Override
	public void find() {
		System.out.println("find requirementgroup..");
	}

	@Override
	public void add() {
		System.out.println("requirementGroup add requirement");
	}

	@Override
	public void delete() {
		System.out.println("requirementGroup delete requirement");
	}

	@Override
	public void change() {
		System.out.println("requirementGroup chage requirement");
	}

	@Override
	public void plan() {
		System.out.println("requirementGroup plan");
	}
}
