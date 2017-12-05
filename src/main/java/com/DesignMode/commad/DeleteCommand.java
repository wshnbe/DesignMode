package com.DesignMode.commad;

/**
 * performer delete command
 * @author wulinli
 *
 */
public class DeleteCommand extends Command{

	@Override
	public void execute() {
		this.requirement.delete();
		this.page.delete();
		this.code.delete();
	}
}
