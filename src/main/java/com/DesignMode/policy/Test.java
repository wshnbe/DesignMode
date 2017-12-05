package com.DesignMode.policy;

public class Test {

	public static void main(String[] args) {
		Add add = new Add(10, 12);
		Mul mul = new Mul(20,8);
		/* 执行加法 */
		Context context = new Context(add);
		context.doIt();
		/* 执行减法 */
		context = new Context(mul);
		context.doIt();
		
		/* 策略枚举 */
		System.out.println(EnumPolicyTest.ADD.exec(10, 20));
	}
}
