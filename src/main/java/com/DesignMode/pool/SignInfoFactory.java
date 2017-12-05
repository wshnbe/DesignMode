package com.DesignMode.pool;

import java.util.HashMap;

public class SignInfoFactory {

	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	
	@Deprecated
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
	
	public static SignInfo getSignInfo(String key){
		if(pool.containsKey(key)){
			System.out.println("直接从pool中取得!"+key);
			return pool.get(key);
		}else{
			System.out.println("pool中并不存在obj,建立对象并放入池中."+key);
			pool.put(key, new SignSubInfo(key));
			return pool.get(key);
		}
	}
}
