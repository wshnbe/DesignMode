package com.DesignMode.pool;

public class SignSubInfo extends SignInfo{

	private String key;

	public SignSubInfo(String _key){
		this.key = _key;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
