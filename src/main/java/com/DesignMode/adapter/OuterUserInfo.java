package com.DesignMode.adapter;

import java.util.Map;

/**
 * 适配器关键角色,中转类
 * @author wulinli
 *
 */
@SuppressWarnings({ "rawtypes"})
public class OuterUserInfo extends OuterInfo implements IUserInfo{

	private Map baseInfo = this.getUserBaseInfo();
	private Map address = this.getUserAddressInfo();
	private Map familiy = this.getUserFamiliyInfo();
	
	public String getName() {
		return baseInfo.get("name").toString();
	}

	public String getAddressInfo() {
		return address.get("address").toString();
	}

	public String getFamiliyInfo() {
		return familiy.get("familiy").toString();
	}
}
