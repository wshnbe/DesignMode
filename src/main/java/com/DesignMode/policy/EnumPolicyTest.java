package com.DesignMode.policy;

/**
 * 策略枚举
 * @author wulinli
 *
 */
public enum EnumPolicyTest {

	ADD() {
		public int exec(int a,int b){
			return a+b;
		}
	},
	
	SUB() {
		public int exec(int a,int b){
			return a-b;
		}
	};
	public abstract int exec(int a,int b);
}
