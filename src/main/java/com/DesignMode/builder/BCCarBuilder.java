package com.DesignMode.builder;

import java.util.ArrayList;

public class BCCarBuilder extends CarBuilder{

	private CarModel carModel = new BCCarModel();

	@Override
	public void setSequeue(ArrayList<String> actions) {
		this.carModel.setSequeue(actions);
	}

	@Override
	public CarModel getCarModel() {
		return carModel;
	}
}
