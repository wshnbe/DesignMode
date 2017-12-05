package com.DesignMode.review.single;

/**
 * 枚举单利模式
 * 
 * 符合线程安全 和 延迟加载，但是语法有时候有点疑惑，不是太流行。
 * @author wulinli
 *
 */
public enum SingleObjectEnum {

	INSTANCE ;//定义一个枚举的实例
	
	private Single single;
	
	private SingleObjectEnum(){
		single = new Single();
	}

	public Single getSingle(){
		return single;
	}
	
	public static void main(String[] args) {
		//单利的使用
		SingleObjectEnum.INSTANCE.getSingle();
	}
}


class Single{
	
}