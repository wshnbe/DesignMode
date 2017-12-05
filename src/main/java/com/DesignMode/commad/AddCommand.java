package com.DesignMode.commad;

/**
 * performer add command
 * @author wulinli
 *
 */
public class AddCommand extends Command{

	@Override
	public void execute() {
		this.requirement.add();
		this.page.add();
		this.code.add();
	}
}
