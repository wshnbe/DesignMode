package com.DesignMode.mediator;

public class Sale extends AbstractColleague{

	public Sale(AbstractMediator _mediator) {
		super(_mediator);
	}

	public void sellIBMComputer(int number){
		super.mediator.execute("sale.sell", number);
		System.out.println("销售IBM电脑"+number+"台");
	}
	
	public void offSale(){
		super.mediator.execute("sale.offsell");
	}
}
