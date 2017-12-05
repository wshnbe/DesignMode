package com.DesignMode.pool;

public class Client {

	public static void main(String[] args) {
		for(int i=0;i<4;i++){
			String subject = "科目" + i;
			for(int j=0;j<10;j++){
				String key = subject + "考试地点" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		SignInfo info = SignInfoFactory.getSignInfo("科目1考试地点1");
		System.out.println(info.getId());
	}
}
