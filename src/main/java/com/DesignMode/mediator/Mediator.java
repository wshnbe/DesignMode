package com.DesignMode.mediator;

public class Mediator extends AbstractMediator{

	@Override
	public void execute(String str, Object... objects) {
		if(str.equals("purchase.buy")){
			this.purchase.buyIBMComputer((Integer)objects[0]);
		}else if(str.equals("sale.sell")){
			this.sale.sellIBMComputer((Integer)objects[0]);
		}else if(str.equals("sale.offsell")){
			this.sale.offSale();
		}else if(str.equals("stock.clear")){
			this.stock.clearStock();
		}
	}
}
