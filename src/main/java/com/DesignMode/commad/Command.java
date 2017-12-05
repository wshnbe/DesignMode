package com.DesignMode.commad;

public abstract class Command {

	protected RequirementGroup requirement = new RequirementGroup();
	protected PageGroup page = new PageGroup();
	protected CodeGroup code = new CodeGroup();
	
	/* dosomething */
	public abstract void execute();
}
