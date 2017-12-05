package com.DesignMode.policy;

import java.util.List;

public enum EnumPolicy {

	/** 非空断言器 */  
    NotNull() {  
        @Override  
        public <T> T doAssert(T t, String desc) throws Exception {  
            if (t == null) {  
                throw new Exception(desc);  
            }  
            return t;  
        }  
    },  
  
    /** 非空List断言器 */  
    NotEmptyList {  
  
        @SuppressWarnings("rawtypes")  
        @Override  
        public <T> T doAssert(T t, String desc) throws Exception {  
            NotNull.doAssert(t, desc); // 先进行非空断言  
            if (t instanceof List) {  
                if (((List) t).isEmpty()) {  
                    throw new Exception(desc);  
                }  
            } else {  
                throw new Exception("不是需要的java.util.List类型");  
            }  
            return t;  
        }  
    };  
  
    /** 
     * 对于对象进行断言 
     *  
     * @Description: 
     * @param <T> 
     * @param t 对象 
     * @param desc 描述信息 
     * @return 
     * @throws Exception 
     * @author kevin.lee 
     * @since：2012-7-23 上午08:10:44 
     */  
    public abstract <T> T doAssert(T t, String desc) throws Exception;  
}
