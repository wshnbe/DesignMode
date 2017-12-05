package com.DesignMode.builder;

import java.util.ArrayList;

public class BMCarBuilder extends CarBuilder{

	private CarModel carModel = new BMCarModel();
	
	@Override
	public void setSequeue(ArrayList<String> actions) {
		this.carModel.setSequeue(actions);
	}

	@Override
	public CarModel getCarModel() {
		return carModel;
	}

}
