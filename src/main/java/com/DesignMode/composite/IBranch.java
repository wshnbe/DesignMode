package com.DesignMode.composite;

import java.util.ArrayList;

public interface IBranch extends ICorp{

	public void addSub(ICorp corp);
	//public void removeSub(ICorp corp);
	public ArrayList<ICorp> getSubList();
}
