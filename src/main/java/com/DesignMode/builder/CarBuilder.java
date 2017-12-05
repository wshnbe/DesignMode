package com.DesignMode.builder;

import java.util.ArrayList;

public abstract class CarBuilder {

	public abstract void setSequeue(ArrayList<String> actions);
	
	public abstract CarModel getCarModel();
}
