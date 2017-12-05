package com.DesignMode.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 外部类
 * @author wulinli
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class OuterInfo implements IOuterInfo{

	public Map getUserBaseInfo() {
		Map map = new HashMap();
		map.put("name", "this is name");
		return map;
	}

	public Map getUserAddressInfo() {
		Map map = new HashMap();
		map.put("address", "address is china");
		return map;
	}

	public Map getUserFamiliyInfo() {
		Map map = new HashMap();
		map.put("familiy", "familiy is home");
		return map;
	}
}
